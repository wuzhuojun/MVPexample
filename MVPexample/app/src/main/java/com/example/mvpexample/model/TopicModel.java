package com.example.mvpexample.model;

/**
 * Description :
 */
public interface TopicModel {

    void loadTopic(int pageIndex, TopicModelImpl.OnLoadTopicListListener listener);
}
