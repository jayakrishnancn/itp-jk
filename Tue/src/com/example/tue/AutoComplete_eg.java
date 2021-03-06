package com.example.tue;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoComplete_eg extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_complete_eg);
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("String1");
		al.add("String12");
		al.add("String3");
		
		ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,al);
		AutoCompleteTextView at=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		at.setAdapter(ad);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.auto_complete_eg, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
