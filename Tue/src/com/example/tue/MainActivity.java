package com.example.tue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;    

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 
	}
	public void Student(View v)
	{
		Intent i =new Intent(this,Insert_Student_data.class);
		startActivity(i);
		
	}
	public void show_ToggleBtn(View v){
		Intent i =new Intent(this,ToggleBtn.class);
		startActivity(i);
		
	}
	public void Fragments_eg(View v) {
		// TODO Auto-generated method stub
		Intent i =new Intent(this,Eg_Fragments.class);
		startActivity(i);

	}
	public void DataBase_eg(View v) {
		// TODO Auto-generated method stub
		Intent i =new Intent(this,Eg_DataBase.class);
		startActivity(i);

	}
	public void AutoComplete_click(View v) {
		// TODO Auto-generated method stub
		Intent i =new Intent(this,AutoComplete_eg.class);
		startActivity(i);

	}
	public void eg_forms(View v) {
		// TODO Auto-generated method stub
		Intent i =new Intent(this,Eg_Form.class);
		startActivity(i);

	}
	public void Fragment_Dynamic(View v){
		Intent i =new Intent(this,DynamicFragment_eg.class);
		startActivity(i);
		
	}
	public void eg_Optionmenu(View v){
		Intent i =new Intent(this,MenuOptions.class);
		startActivity(i);
		
	}
	public void gotoCheckbox(View v){
		Intent i =new Intent(this,CheckBox_Activity.class);
		startActivity(i);
	}
	public void egSlider(View v){
		Intent i =new Intent(this,EgSliderBar.class);
		startActivity(i);		
	}
	public void get_calc(View v){
		Intent i =new Intent(this,Eg_Calculator.class);
		startActivity(i);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
