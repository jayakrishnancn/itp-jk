package com.example.tue;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Student_view extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_view);
		Button backBtn=(Button) findViewById(R.id.button1_bk);

		Button FirstBtn=(Button) findViewById(R.id.button1);

		Button LastBtn=(Button) findViewById(R.id.button2);
		Button NextBtn=(Button) findViewById(R.id.button3);
		Button PrevBtn=(Button) findViewById(R.id.button4);
		
		backBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Student_view.this.finish();
			}
		});
		
		SQLiteDatabase db=openOrCreateDatabase("student_details", 0, null);
		final Cursor c=db.rawQuery("select * from STUDENTDETAILS", null);

		
		FirstBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
				c.moveToFirst();
				setit(c);}
			catch(Exception e)
			{
				Toast.makeText(Student_view.this, "Error:"+e, Toast.LENGTH_LONG).show();
			}
				
			}
		});
		LastBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
				c.moveToLast();
				setit(c);}
			catch(Exception e)
			{
				Toast.makeText(Student_view.this, "Error:"+e, Toast.LENGTH_LONG).show();
			}
				
			}
		});
		NextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
				c.moveToNext();
				setit(c);}
			catch(Exception e)
			{
				Toast.makeText(Student_view.this, "Error:"+e, Toast.LENGTH_LONG).show();
			}
				
			}
		});
		PrevBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
				c.moveToPrevious();
				setit(c);
				}
				catch(Exception e)
				{
					Toast.makeText(Student_view.this, "Error:"+e, Toast.LENGTH_LONG).show();
				}
				
			}
		});
		
//
//		final FragmentManager fm=getFragmentManager();
//		FragmentTransaction ft=fm.beginTransaction();
//		
//		ft.add(R.id.fragment_container, new Login_Fragment());
//		ft.commit();
//		
//		
//		
//		Button firstBtn= (Button) findViewById(R.id.button1);
//		firstBtn.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				 FragmentTransaction ft=fm.beginTransaction();
//				ft.replace(R.id.fragment_container, new FirstFragment());
//				ft.commit();
////				
////Toast.makeText(Student_view.this, "sad", Toast.LENGTH_LONG).show();
//				
//				
//
//				
//			}
//		});
	}
public void setit(Cursor c)
{

	TextView id_=(TextView) findViewById(R.id.TextView07);
	TextView name_=(TextView) findViewById(R.id.TextView05);
	TextView qlfn_=(TextView) findViewById(R.id.TextView03);
	TextView marks_=(TextView) findViewById(R.id.TextView01);
	id_.setText(c.getString(c.getColumnIndex("ID")));
	name_.setText(c.getString(c.getColumnIndex("NAME")));
	qlfn_.setText(c.getString(c.getColumnIndex("QLFN")));
	marks_.setText(c.getString(c.getColumnIndex("MARKS")));
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_view, menu);
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
