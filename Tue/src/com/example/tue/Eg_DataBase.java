package com.example.tue;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Eg_DataBase extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eg__data_base);
		SQLiteDatabase db= openOrCreateDatabase("mydb", 0, null);
		db.execSQL("create table if not exists student(id int ,name varchar(20),age int)") ;
		ContentValues cv= new ContentValues(); 
/*
		cv.put("id", 1);
		cv.put("name", "jk");
		cv.put("age", 21);
		Toast.makeText(this, "put1", Toast.LENGTH_LONG).show();
		db.insert("student", null, cv);

		cv.put("id", 2);
		cv.put("name", "rs");
		cv.put("age", 22);
		
		db.insert("student", null, cv);
 
*//*update
		cv.put("id", 1);
		cv.put("name", "jk2");
		cv.put("age", 22);
		db.update("student",cv, "id=?", new String[]{"1"});*/
		db.delete("student", "id=?", new String[]{"1"});
		Cursor c=db.rawQuery("select * from student", null);
		c.moveToFirst();
		String s="nulll";
		do{
			s=c.getString(c.getColumnIndex("id"))+"\n"+c.getString(c.getColumnIndex("name"))+"\n"+c.getString(c.getColumnIndex("age"))+"\n";
			Toast.makeText(this,s,Toast.LENGTH_LONG).show();
			
			
		}while(c.moveToNext());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eg__data_base, menu);
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
