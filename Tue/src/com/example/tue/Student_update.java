package com.example.tue;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student_update extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_update);
		Button get = (Button) findViewById(R.id.button3);
		Button updateBtn = (Button) findViewById(R.id.button2);
		Button back = (Button) findViewById(R.id.button1);

		get.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				EditText id_ = (EditText) findViewById(R.id.editText1);
				EditText name_ = (EditText) findViewById(R.id.editText2);
				EditText qlfn_ = (EditText) findViewById(R.id.editText3);
				EditText marks_ = (EditText) findViewById(R.id.editText4);

				SQLiteDatabase db = openOrCreateDatabase("student_details", 0, null);
				db.execSQL(
						"CREATE TABLE IF NOT EXISTS STUDENTDETAILS (ID INT ,NAME VARCHAR(20),QLFN VARCHAR(10),MARKS INT)");

				Cursor c = db.rawQuery("SELECT * FROM STUDENTDETAILS WHERE ID=?",
						new String[] { id_.getText().toString() });
				c.moveToFirst();
				name_.setText(c.getString(c.getColumnIndex("NAME")));
				qlfn_.setText(c.getString(c.getColumnIndex("QLFN")));
				marks_.setText(c.getString(c.getColumnIndex("MARKS")));

			}
		});

		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Student_update.this.finish();

			}
		});

		updateBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText id_ = (EditText) findViewById(R.id.editText1);
				EditText name_ = (EditText) findViewById(R.id.editText2);
				EditText qlfn_ = (EditText) findViewById(R.id.editText3);
				EditText marks_ = (EditText) findViewById(R.id.editText4);

				int id = Integer.parseInt(id_.getText().toString());
				String name = name_.getText().toString();
				String qlfn = qlfn_.getText().toString();
				int marks = Integer.parseInt(marks_.getText().toString());

				SQLiteDatabase db = openOrCreateDatabase("student_details", 0, null);
				db.execSQL(
						"CREATE TABLE IF NOT EXISTS STUDENTDETAILS (ID INT ,NAME VARCHAR(20),QLFN VARCHAR(10),MARKS INT)");

				ContentValues cv = new ContentValues();
				cv.put("ID", id);
				cv.put("NAME", name);
				cv.put("QLFN", qlfn);
				cv.put("MARKS", marks);
				db.update("STUDENTDETAILS", cv, "id=?", new String[] { id_.getText().toString() });

				Cursor c = db.rawQuery("SELECT * FROM STUDENTDETAILS ", null);
				c.moveToFirst();
				String s;
				do {
					s = c.getString(c.getColumnIndex("ID")) + "\n" + c.getString(c.getColumnIndex("NAME")) + "\n"
							+ c.getString(c.getColumnIndex("QLFN")) + "\n" + c.getString(c.getColumnIndex("MARKS"));
					Toast.makeText(Student_update.this, s, Toast.LENGTH_LONG).show();
				} while (c.moveToNext());

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_update, menu);
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
