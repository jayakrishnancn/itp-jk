package com.example.tue;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBox_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box);
	}

	public void checkall(View v){
		CheckBox c1=(CheckBox) findViewById(R.id.checkBox2);
		CheckBox c2=(CheckBox) findViewById(R.id.checkBox1);
		CheckBox c3=(CheckBox) findViewById(R.id.checkBox3);
		String msg=""; 

		if(c1.isChecked())
		{
			msg+="\n One: checked";
		}
		else{
			msg+="\n One: Unchecked"; 
		}
		
		if(c2.isChecked())
		{
			msg+="\n Two: checked";
		}
		else{
			msg+="\n Two: Unchecked"; 
		}
		
		if(c3.isChecked())
		{
			msg+="\nThree: checked";
		}
		else{
			msg+="\nThree: Unchecked"; 
		}
		
		Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.check_box, menu);
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
