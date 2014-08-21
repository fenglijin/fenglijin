package com.anshun.popupwindow;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.PopupWindow;

public class MainActivity extends Activity {
    private PopupWindow pop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	     setContentView(R.layout.activity_main);
		init();
	}
	private void init() {
		LayoutInflater inflater=LayoutInflater.from(this);
		View view=inflater.inflate(R.layout.pop, null);
		pop=new PopupWindow(view,230,150);
	}
}
