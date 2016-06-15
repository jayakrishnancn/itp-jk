package com.example.tue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class Eg_Form extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eg__form);
 
		
		
		final RatingBar grade_=(RatingBar) findViewById(R.id.ratingBar1);
		Button submit_=(Button) findViewById(R.id.button1);
		SeekBar marks_=(SeekBar) findViewById(R.id.seekBar1);
		
		marks_.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			 
			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				int pro=0;
				if(arg1>30&&arg1<40)
				{
					pro=1;
				}
				else if(arg1>=40&&arg1<60){
					pro=2;
				}
				else if(arg1>=60&&arg1<80){
					pro=3;
				}
				else if(arg1>=80&&arg1<=100){
					pro=4;
				}
				else{
					pro=0;
				}
				grade_.setRating(pro);
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		submit_.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				EditText name_=(EditText) findViewById(R.id.editText1);
				EditText age_=(EditText) findViewById(R.id.editText2);
				RadioGroup gender_=(RadioGroup) findViewById(R.id.radioGroup1);
				CheckBox lang_c=(CheckBox) findViewById(R.id.checkBox1);
				CheckBox lang_cpp=(CheckBox) findViewById(R.id.checkBox2);
				CheckBox lang_java=(CheckBox) findViewById(R.id.checkBox3);
				
				
				final RatingBar grade_=(RatingBar) findViewById(R.id.ratingBar1); 
				
				SeekBar marks_=(SeekBar) findViewById(R.id.seekBar1);
				
				Bundle bund=new Bundle();
				bund.putString("name", name_.getText().toString());
				bund.putString("age", age_.getText().toString()); 
				RadioButton rb=(RadioButton)findViewById(gender_.getCheckedRadioButtonId());
				bund.putString("gender",(String) rb.getText() ); 
				
				bund.putInt("lang_c", (lang_c.isChecked()?1:0) );
				bund.putInt("lang_cpp", (lang_cpp.isChecked()?1:0) );
				bund.putInt("lang_java", (lang_java.isChecked()?1:0) );
				bund.putInt("marks", marks_.getProgress());
				bund.putLong("grade", (long) grade_.getRating());

				Intent i=new Intent(Eg_Form.this,Confirm_form.class);
				i.putExtra("bundle", bund);
				startActivity(i);
				
			}
		});
	}

	public void submit_form(){

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eg__form, menu);
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
