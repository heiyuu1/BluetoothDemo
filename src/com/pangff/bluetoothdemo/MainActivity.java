package com.pangff.bluetoothdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pangff.bluetoothdemo.Bluetooth.ServerOrCilent;

public class MainActivity extends Activity {

	private Button sever;
	private Button client;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sever = (Button) this.findViewById(R.id.sever);
		client = (Button) this.findViewById(R.id.client);
		initHandler();
	}
	
	
	private void initHandler(){
		sever.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Bluetooth.serviceOrCilent = ServerOrCilent.SERVICE;
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, ChatActivity.class);
				startActivity(intent);
			}
		});
		
		client.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, ClientActivity.class);
				startActivity(intent);
			}
		});
	}

}
