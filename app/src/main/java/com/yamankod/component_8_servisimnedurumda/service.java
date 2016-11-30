package com.yamankod.component_8_servisimnedurumda;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class service extends Service {
	private final String TAG = "servis";
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i(TAG, "I am alive!!!");
	}
	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		Log.e(TAG, "I did something quickly");
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.v(TAG, "I am dead!!!");
	}
}
