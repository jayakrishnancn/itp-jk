package com.example.tue;

import android.app.Fragment;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.TextView; 

public class FirstFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.first_fragment, container);
	} 
//	@Override
////	public void onStart() {
//		// TODO Auto-generated method stub
//		super.onStart();
///*
//		TextView id_=(TextView) getActivity().findViewById(R.id.TextView07);
//		TextView name_=(TextView) getActivity().findViewById(R.id.TextView05);
//		TextView qlfn_=(TextView) getActivity().findViewById(R.id.TextView03);
//		TextView marks_=(TextView) getActivity().findViewById(R.id.TextView01);
//
//		SQLiteDatabase db1=getActivity().openOrCreateDatabase("student_details", 0, null);
//		Cursor cr=db1.rawQuery("SELECT * FROM STUDENTDETAILS", null);
//		cr.close();
//		
//		id_.setText("Asd");
//		name_.setText("Asd");
//		qlfn_.setText("Asd");
//		marks_.setText("Asd");*/
//	}
}
