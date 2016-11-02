// 기본화면. 저장된일정보기, 추가, NaviDrawer등

package com.HikingBear.DYDT;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

//package com.android.support.design;



@SuppressWarnings("deprecation")
public class MainActivity extends Activity {

	private String[] navItems = {"달성률", "리뷰쓰기", "건의사항", "설정"};			// 이걸더 간드러지게 할수있는방법?
	
	private ListView lvNavList;
	private FrameLayout flContainer;
	
	private DrawerLayout dlDrawer;
	private ActionBarDrawerToggle dtToggle;
	private ActionBar actionBar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		actionBar = getActionBar();
//		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setTitle("Main");
		actionBar.setDisplayShowHomeEnabled(false);

		lvNavList = (ListView) findViewById(R.id.lv_activity_main_nav_list);
		flContainer = (FrameLayout) findViewById(R.id.fl_activity_main_container);
		
		lvNavList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navItems));
		lvNavList.setOnItemClickListener(new DrawerItemClickListener());
		
		dlDrawer = (DrawerLayout)findViewById(R.id.dl_activity_main_drawer);
		dtToggle = new ActionBarDrawerToggle(this, dlDrawer, 
				R.drawable.ic_drawer, R.string.open_drawer, R.string.close_drawer){

					@Override
					public void onDrawerClosed(View drawerView) {
						super.onDrawerClosed(drawerView);
					}

					@Override
					public void onDrawerOpened(View drawerView) {
						super.onDrawerOpened(drawerView);
					}
			
		};
		
		dlDrawer.setDrawerListener(dtToggle);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		
	}
	
	protected void onPostCreate(Bundle savedInstanceState){
		super.onPostCreate(savedInstanceState);
		dtToggle.syncState();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(dtToggle.onOptionsItemSelected(item)){
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		dtToggle.onConfigurationChanged(newConfig);
	}
	

	// Navigation Drawer 부분
	private class DrawerItemClickListener implements ListView.OnItemClickListener{

		@Override
		public void onItemClick(AdapterView<?> adapter, View view, int position,
				long id) {
			switch(position){ // private String[] navItems = {"달성률", "리뷰쓰기", "건의사항", "설정"};
			case 0:
				Intent intent1 = new Intent(MainActivity.this, AchievementActivity.class);
				startActivity(intent1);
				//flContainer.setBackgroundColor(Color.parseColor("#A52A2A"));
				break;
			case 1:
				//Intent intent2 = new Intent(MainActivity.this, AchievementActivity.class);
				//startActivity(intent1);
				flContainer.setBackgroundColor(Color.parseColor("#5F9EA0"));
				break;
			case 2:
				Intent intent3 = new Intent(MainActivity.this, SendActivity.class);
				startActivity(intent3);
				//flContainer.setBackgroundColor(Color.parseColor("#556B2F"));
				break;
			case 3:
				Intent intent4 = new Intent(MainActivity.this, SettingsActivity.class);
				startActivity(intent4);
				//flContainer.setBackgroundColor(Color.parseColor("#FF8C00"));
				break;
			}
			dlDrawer.closeDrawer(lvNavList);
		}
		
	}
	
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/
}

	



