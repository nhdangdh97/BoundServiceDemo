package com.example.nhdangdh.boundservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Calendar;
import java.util.Date;

public class MyService extends Service {

    private final IBinder binder = new LocalBinder();

    public class LocalBinder extends Binder{
        MyService getService(){
           return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public Date getCurrentDate(){
        return Calendar.getInstance().getTime();
    }
}
