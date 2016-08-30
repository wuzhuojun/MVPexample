package com.example.mvpexample;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.example.mvpexample.bean.TopicBean;
import com.example.mvpexample.common.LogUtils;
import com.example.mvpexample.model.TopicModelImpl;

import java.util.List;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);

        try {
            testLoadTopic();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testLoadTopic() throws Exception {
        new TopicModelImpl().loadTopic(1, new TopicModelImpl.OnLoadTopicListListener() {
            @Override
            public void onSuccess(List<TopicBean> list) {
                LogUtils.v("success", "get topic list success.");
            }

            @Override
            public void onFailure(String msg, Exception e) {
                LogUtils.v("fail", "get topic list error.");
            }
        });

    }
}