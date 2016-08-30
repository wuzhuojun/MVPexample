package com.example.mvpexample.fragment;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.mvpexample.R;
import com.example.mvpexample.adapter.TopicListAdapter;
import com.example.mvpexample.bean.TopicBean;
import com.example.mvpexample.bean.TopicJson;
import com.example.mvpexample.common.ACache;
import com.example.mvpexample.presenter.TopicPresenter;
import com.example.mvpexample.presenter.TopicPresenterImpl;
import com.example.mvpexample.view.TopicView;
import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

/**
 * Created by Administrator on 2016/8/26.
 */
public class TopicListFragment extends Fragment implements TopicView,AbsListView.OnScrollListener {

    private TopicListAdapter topicListAdapter;

    @BindView(R.id.list_topic)
    ListView mTopicListView;

    @BindView(R.id.rotate_header_list_view_frame)
    protected PtrClassicFrameLayout mPtrFrame;//下拉刷新的控件

    private int currentPage = 1;
    private int lastVisibleItem = 0; //最后可以见item

    private int totalItemCount = 0; //总item数量
    private View footView; //底部加载更多界面布局

    private TopicPresenter mNewsPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topic_list, container, false);
        ButterKnife.bind(this, view);

        mNewsPresenter = new TopicPresenterImpl(this);

        initView();
        return view;
    }

    private void initView()
    {
        topicListAdapter = new TopicListAdapter(getActivity());
        footView = getActivity().getLayoutInflater().inflate(R.layout.item_footer, null);
        footView.setVisibility(View.GONE);
        mTopicListView.addFooterView(footView);
        mTopicListView.setAdapter(topicListAdapter);
        mTopicListView.setOnScrollListener(this);


        mPtrFrame.setLastUpdateTimeRelateObject(this);
        mPtrFrame.setPtrHandler(new PtrHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                updateData();
            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, content, header);
            }
        });

        // the following are default settings
        mPtrFrame.setResistance(1.7f);
        mPtrFrame.setRatioOfHeaderHeightToRefresh(1.2f);
        mPtrFrame.setDurationToClose(200);
        mPtrFrame.setDurationToCloseHeader(1000);
        // default is false
        mPtrFrame.setPullToRefresh(false);
        // default is true
        mPtrFrame.setKeepHeaderWhenRefresh(true);

        onRefresh();
    }

    //刷新数据
    public void onRefresh() {
        currentPage = 1;
        if(topicListAdapter.getCount() != 0) {
            topicListAdapter.clear();
        }
        mNewsPresenter.loadTopic(currentPage);
    }

/*    private void initData()
    {
        new GetHttpDataTask().execute();
    }*/

    protected void updateData() {
        mPtrFrame.postDelayed(new Runnable() {
            @Override
            public void run() {
//                topicListAdapter.clear();
//                currentPage = 1;
//                new GetHttpDataTask().execute();
                onRefresh();
                mPtrFrame.refreshComplete();
            }
        }, 0);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (lastVisibleItem == totalItemCount && scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE) {
            //当前可见的最后item位置 与 总item数量相等，表示已经滑到底部了
            footView.setVisibility(View.VISIBLE);
            currentPage++;
//            new GetHttpDataTask().execute();

            mNewsPresenter.loadTopic(currentPage);
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        lastVisibleItem = firstVisibleItem + visibleItemCount;
        this.totalItemCount = totalItemCount;
    }


    //增加数据的方法
    @Override
    public void addTopic(List<TopicBean> newsList) {
        topicListAdapter.addDatas(newsList);
    }

}
