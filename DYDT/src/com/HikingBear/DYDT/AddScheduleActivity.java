// 일정추가 액티비티. 사실상 메인

package com.HikingBear.DYDT;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class AddScheduleActivity extends Activity{
	private ActionBar actionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addschedule);
		
		actionBar = getActionBar();
		
		//actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setTitle("addschedule");
		actionBar.setDisplayShowHomeEnabled(false);
	}

}
