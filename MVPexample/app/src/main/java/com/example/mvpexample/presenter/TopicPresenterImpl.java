package com.example.mvpexample.presenter;

import com.example.mvpexample.bean.TopicBean;
import com.example.mvpexample.model.TopicModel;
import com.example.mvpexample.model.TopicModelImpl;
import com.example.mvpexample.view.TopicView;
import java.util.List;

/**
 * Description :
 */
public class TopicPresenterImpl implements TopicPresenter, TopicModelImpl.OnLoadTopicListListener {

    private static final String TAG = "TopicPresenterImpl";

    private TopicView mNewsView;
    private TopicModel mNewsModel;

    public TopicPresenterImpl(TopicView newsView) {
        this.mNewsView = newsView;
        this.mNewsModel = new TopicModelImpl();
    }

    @Override
    public void loadTopic(final int pageIndex) {
        mNewsModel.loadTopic(pageIndex, this);
    }

    public void onSuccess(List<TopicBean> list) {
        mNewsView.addTopic(list);
    }

    @Override
    public void onFailure(String msg, Exception e) {
    }
}
