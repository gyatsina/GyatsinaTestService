package com.example.gyatsina.gyatsinatestservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by gyatsina on 1/26/2015.
 */
public class TestService extends Service {
    private String TAG = "TestService";
    private MyBinder myBinder = new MyBinder();
    private int count = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "------------- onCreate");
        doSomeGenerlTask();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    private void doSomeGenerlTask(){
        Log.d(TAG, "------------- doSomeGenerlTask, count="+ count);
    }

    private class MyBinder extends Binder {
        private TestService getService() {
            return TestService.this;
        }
    }

    private void sendSignal_1(){
        Log.d(TAG, "------------- sendSignal_1");
    }

    private void sendSignal_2(){
        Log.d(TAG, "------------- sendSignal_2");
    }
}
