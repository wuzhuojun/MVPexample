package com.example.mvpexample;

import android.app.Application;

import com.example.mvpexample.common.ACache;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by wuzhuojun on 2016/8/3 0003.
 */
public class AppContext extends Application {
    public static ACache mACache;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);  //Facebook图片组件 初始化
        mACache = ACache.get(this);//初始化缓存
    }
}