// �����ڿ��� ���Ϻ����� ���.

package com.HikingBear.DYDT;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class SendActivity extends Activity{
	private ActionBar actionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send);
		
		actionBar = getActionBar();
		//actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setTitle("send");
		actionBar.setDisplayShowHomeEnabled(false);
	}

}
