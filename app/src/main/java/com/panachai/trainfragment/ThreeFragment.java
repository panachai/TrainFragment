package com.panachai.trainfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.View.OnClickListener;
import android.widget.Button;



public class ThreeFragment extends Fragment {


    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        Button btn_close = (Button)rootView.findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                //getFragmentManager().beginTransaction().remove(ThreeFragment.this).commit();
                getFragmentManager().popBackStack();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

}
