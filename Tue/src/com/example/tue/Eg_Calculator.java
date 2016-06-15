package com.example.tue;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Eg_Calculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eg__calculator);
		Button b_add = (Button) findViewById(R.id.button1);
		Button b_sub = (Button) findViewById(R.id.button2);
		Button b_mul = (Button) findViewById(R.id.button3);
		Button b_div = (Button) findViewById(R.id.button4);

		final EditText X1 = (EditText) findViewById(R.id.editText1);
		final EditText X2 = (EditText) findViewById(R.id.editText2);

		b_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stubtoString() 
				int sum=0;
				if(X1.getText().toString().length()>0&&X2.getText().toString().length()>0)
				 sum = Integer.parseInt(X1.getText().toString()) + Integer.parseInt(X2.getText().toString());
				Toast.makeText(Eg_Calculator.this, "Sum:" + sum, Toast.LENGTH_LONG).show();
			}
		});
		b_sub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int sum=0;
				if(X1.getText().toString().length()>0&&X2.getText().toString().length()>0)
				 sum = Integer.parseInt(X1.getText().toString()) - Integer.parseInt(X2.getText().toString());
				Toast.makeText(Eg_Calculator.this, "Sum:" + sum, Toast.LENGTH_LONG).show();
			}
		});
		b_mul.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stubtoString()
				int sum=0;
				if(X1.getText().toString().length()>0&&X2.getText().toString().length()>0)
				 sum = Integer.parseInt(X1.getText().toString()) * Integer.parseInt(X2.getText().toString());
				Toast.makeText(Eg_Calculator.this, "Sum:" + sum, Toast.LENGTH_LONG).show();
			}
		});
		b_div.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int sum=0;
				if(X1.getText().toString().length()>0&&X2.getText().toString().length()>0)
				 sum = Integer.parseInt(X1.getText().toString()) / Integer.parseInt(X2.getText().toString());
				Toast.makeText(Eg_Calculator.this, "Sum:" + sum, Toast.LENGTH_LONG).show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eg__calculator, menu);
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
