package com.example.tue;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fraj_1 extends Fragment {

@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub 
	
	View v=inflater.inflate(R.layout.fragment1, container);
	return v;
	}
@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		Button b = (Button) getActivity().findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText e = (EditText) getActivity().findViewById(R.id.editText1);
				TextView t=(TextView) getActivity().findViewById(R.id.textView1);
				t.setText(e.getText().toString());
			}
		});

	}

}
