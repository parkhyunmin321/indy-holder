package com.example.app;

import android.app.Application;

import kr.co.bdgen.indywrapper.IndyWrapper;

public class MyApplication extends Application {

    @Override
    public void onCreate() { //처음 시작하는 곳 (대부분 초기화 구문 집어 넣음)
        super.onCreate();

        IndyWrapper.init(this);
    }
}
