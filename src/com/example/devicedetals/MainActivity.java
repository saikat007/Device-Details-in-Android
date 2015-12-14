package com.example.devicedetals;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
	   TelephonyManager tm = (TelephonyManager)getSystemService
			   (Context.TELEPHONY_SERVICE);

		        // get IMEI
		       String imei = tm.getDeviceId();

		        // get SimSerialNumber
		       String simSerialNumber = tm.getSimSerialNumber();
		       // get Phone Number
		String phoneNumber = tm.getLine1Number();
		// get Network Operator Name
		String operatorName = tm.getNetworkOperatorName();
		// get Sim Operator Name
		String operatorNames = tm.getSimOperatorName();
		//Device model
		String PhoneModel = android.os.Build.MODEL;

		//Android version
		String AndroidVersion = android.os.Build.VERSION.RELEASE;

		WindowManager mWinMgr = (WindowManager)getSystemService
				(Context.WINDOW_SERVICE);
		      @SuppressWarnings("deprecation")
			int _sWidth= mWinMgr.getDefaultDisplay().getWidth();
		       @SuppressWarnings("deprecation")
			int _sHeight = mWinMgr.getDefaultDisplay().getHeight();

		System.getProperty("os.version"); // OS version
		String sdk=android.os.Build.VERSION.SDK;   // API Level
		String device=android.os.Build.DEVICE ;          // Device
		String model=android.os.Build.MODEL;             // Model 
		String product=android.os.Build.PRODUCT;          // Product

		Toast.makeText(getApplicationContext(), 
		"IMEI NO.: "+imei+"\n"+"Sim Serial No.: "+
		simSerialNumber+"\n"+"Phone No.: "+phoneNumber+"\n"+
		"Operator Name: "+operatorName+"\n"+"Sim Operator Name: "+
		operatorNames+
		"\n"+"Phone Model: "+PhoneModel+"\n"+"Android Version: "+
		AndroidVersion+"\n"+"SDK: "+sdk+"\n"+"Device: "+device+"\n"+
		"Product: "+product, Toast.LENGTH_LONG).show();

			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
