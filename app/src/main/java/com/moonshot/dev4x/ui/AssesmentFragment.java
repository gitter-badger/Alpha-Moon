package com.moonshot.dev4x.ui;

import com.moonshot.dev4x.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AssesmentFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			//Inflate home layout to replace content holder.
			View rootView = inflater.inflate(R.layout.assesment, null);
			return rootView;
	}
}
