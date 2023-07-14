package com.example.app;

import android.app.Application;

import org.hyperledger.indy.sdk.IndyException;
import org.hyperledger.indy.sdk.pool.Pool;

import kr.co.bdgen.indywrapper.IndyWrapper;
import kr.co.bdgen.indywrapper.config.PoolConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() { //처음 시작하는 곳 (대부분 초기화 구문 집어 넣음)
        super.onCreate();

        IndyWrapper.init(this);
        String poolName = PoolConfig.getPoole(this);
        try {
            Pool.openPoolLedger(poolName, "{}").get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
