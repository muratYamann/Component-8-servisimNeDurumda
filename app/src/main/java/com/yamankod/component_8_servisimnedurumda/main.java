package com.yamankod.component_8_servisimnedurumda;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class main extends Activity {
	private Button start,stop;
	private EditText etext;
	Intent myIntent; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        etext = (EditText)findViewById(R.id.etext);
        myIntent = new Intent(this, service.class);        

        start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
		    		startService(myIntent);
		    		etext.setText("My Service Started!!");
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(), e.getMessage(), 1).show();
				}
			}
		});
        stop.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
		    		stopService(myIntent);
		    		etext.setText("My Service Stoppped!!!");
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(), e.getMessage(), 1).show();
				}
			}
		});                
    }
}