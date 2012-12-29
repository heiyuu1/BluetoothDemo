package com.pangff.bluetoothdemo;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;

public class Bluetooth {

	enum ServerOrCilent{
		NONE,
		SERVICE,
		CLIENT
	};
    static String BlueToothAddress = "null";
    static ServerOrCilent serviceOrCilent = ServerOrCilent.NONE;
    static boolean isOpen = false;
	public class SiriListItem {
		String message;
		boolean isSiri;

		public SiriListItem(String msg, boolean siri) {
			message = msg;
			isSiri = siri;
		}
	}   
}
