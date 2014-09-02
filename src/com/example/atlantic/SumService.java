package com.example.atlantic;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public class SumService extends Service {
    @Override
    public void onCreate() {
    }
   
   @Override
   public IBinder onBind(Intent intent) {
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
	    	   int d = a + b;
	           MainActivity.mEditD.setText(String.valueOf(d));
	       }
	   }, c*1000);	   
       return Service.START_NOT_STICKY;
   }


}