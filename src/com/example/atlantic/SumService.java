package com.example.atlantic;

import java.util.Timer;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.IBinder;

public class SumService extends Service {
	static public int d;
	private static Timer timer = new Timer(); 
    @Override
    public void onCreate() {
        // TODO: действи€, которые будут выполн€тьс€ при создании сервиса
    }
   
   @Override
   public IBinder onBind(Intent intent) {
        // TODO: «аменить реализацией прив€зки сервиса
        return null;
    }
   
   @Override
   public int onStartCommand(final Intent intent, int flags, int startId) {

	   int c = intent.getExtras().getInt("c");
	   final Handler handler = new Handler();
	   handler.postDelayed(new Runnable() {
	       @Override
	       public void run() {
	    	   int a = intent.getExtras().getInt("a");
	    	   int b = intent.getExtras().getInt("b");
	           d = a + b;
	           MainActivity.mEditD.setText(String.valueOf(d));
	       }
	   }, c*1000);
//	   d = a + b;
	   
       return Service.START_NOT_STICKY;
   }


}