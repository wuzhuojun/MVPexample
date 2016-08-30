package com.example.mvpexample;

import com.example.mvpexample.bean.TopicBean;
import com.example.mvpexample.common.LogUtils;
import com.example.mvpexample.common.OkHttpUtils;
import com.example.mvpexample.model.TopicModelImpl;

import org.junit.Test;

import java.util.List;

/**
 * Description :
 */
public class TopicModelImplTest {

    @Test
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