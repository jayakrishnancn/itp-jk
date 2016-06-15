package com.example.tue;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Confirm_form extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirm_form);
		
		AlertDialog.Builder abox=new AlertDialog.Builder(this);
		abox.setTitle("Confirm Display!");
		abox.setMessage("click ok to See Form Details.");
		abox.setPositiveButton("OK",new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub

				Intent i=getIntent();
				Bundle b=i.getBundleExtra("bundle");

				String lang_c=((b.getInt("lang_c")==1)?"c\n":"");
				String lang_cpp=((b.getInt("lang_cpp")==1)?"cpp\n":"");
				String lang_java=((b.getInt("lang_java")==1)?"java\n":"");
				String msg=b.getString("name")+"\n"+
						b.getString("age")+"\n"+
						b.getString("gender")+"\n"+
						lang_c+
						lang_cpp+
						lang_java+
						b.getInt("marks")+"\n"+
						b.getLong("grade")+"\n";
				Toast.makeText(Confirm_form.this,msg, Toast.LENGTH_LONG).show();
			}
		});
		abox.setNegativeButton("Cancel",new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				arg0.dismiss();
			}
		});
		AlertDialog ad=abox.create();
		ad.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.confirm_form, menu);
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
