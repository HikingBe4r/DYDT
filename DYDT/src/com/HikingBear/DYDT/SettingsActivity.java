// 설정화면 액티비티.

package com.HikingBear.DYDT;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity{
	private ActionBar actionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		actionBar = getActionBar();
		//actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setTitle("Settings");		// 테스트용. 지울예정.
		actionBar.setDisplayShowHomeEnabled(false);
	}

}
