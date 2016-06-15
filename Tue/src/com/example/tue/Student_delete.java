package com.example.tue;

import android.app.Activity;
import android.app.AlertDialog; 
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener; 
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student_delete extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_delete);

		Button delBtn = (Button) findViewById(R.id.button1);
		Button back = (Button) findViewById(R.id.button2);
		back.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Student_delete.this.finish();

			}
		});
		delBtn.setOnClickListener(new android.view.View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// // TODO Auto-generated method stub
				// EditText id_ = (EditText) findViewById(R.id.editText1);
				// String id = id_.getText().toString();

				Toast.makeText(Student_delete.this, "trying .. deleting...", Toast.LENGTH_LONG).show();
				
				AlertDialog.Builder abox = new AlertDialog.Builder(Student_delete.this);
				abox.setTitle("Confirm Display!");
				abox.setMessage("click ok to Delete Form Details ? ");
				abox.setPositiveButton("OK", new OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						EditText id_ = (EditText) findViewById(R.id.editText1);
						String id = id_.getText().toString();
						SQLiteDatabase db=openOrCreateDatabase("student_details", 0, null);
						db.delete("STUDENTDETAILS", "id=?", new String[]{id});
						Toast.makeText(Student_delete.this, "deleted", Toast.LENGTH_LONG).show();
					}
				});
				abox.setNegativeButton("CANCEL", new OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						arg0.dismiss();
 
					}
				});

				AlertDialog ad=abox.create();
				ad.show();

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_delete, menu);
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
