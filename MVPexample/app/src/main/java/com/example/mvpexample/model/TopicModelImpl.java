package com.example.mvpexample.model;

import com.example.mvpexample.AppContext;
import com.example.mvpexample.bean.TopicBean;
import com.example.mvpexample.bean.TopicJson;
import com.example.mvpexample.common.Api;
import com.example.mvpexample.common.JsonUtils;
import com.example.mvpexample.common.OkHttpUtils;

import java.util.List;

/**
 * Description : 新闻业务处理类
 */
public class TopicModelImpl implements TopicModel {
    private final String topicKey = "topic_list_";

    /**
     * 加载新闻列表
     * @param listener
     */
    @Override
    public void loadTopic(final int pageIndex, final OnLoadTopicListListener listener) {

        String strCache = AppContext.mACache.getAsString(topicKey+pageIndex);
        if(null != strCache)
        {//优先从缓存中获取数据
            TopicJson topicJson = JsonUtils.deserialize(strCache, TopicJson.class);
            listener.onSuccess(topicJson.getList());
        }
        else {//当缓存中没有数据时才从网上获取
            OkHttpUtils.ResultCallback<String> loadNewsCallback = new OkHttpUtils.ResultCallback<String>() {
                @Override
                public void onSuccess(String response) {
                    TopicJson topicJson = JsonUtils.deserialize(response, TopicJson.class);
                    if(null != topicJson) {
                        listener.onSuccess(topicJson.getList());
                        AppContext.mACache.put(topicKey + pageIndex, response);
                    }
                    else
                    {
                        listener.onFailure("json deserialize failure.", new Exception());
                    }
                }

                @Override
                public void onFailure(Exception e) {
                    listener.onFailure("load topic list failure.", e);
                }
            };

            String url = Api.TopicUrl;
            String param = String.format(Api.TopicParam, pageIndex);
            OkHttpUtils.post(url, loadNewsCallback, param);
        }
    }

    public interface OnLoadTopicListListener {
        void onSuccess(List<TopicBean> list);
        void onFailure(String msg, Exception e);
    }
}
