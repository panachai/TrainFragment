package com.panachai.trainfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.panachai.trainfragment.R.layout.fragment_blank;

public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(fragment_blank, container, false);


        Button btn_close = (Button) rootView.findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

            /*      //ลบ Frangment บน Fragment activity พิมเต็ม
                        FragmentManager manager = getFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.remove(blankFragment.this);
                        transaction.commit();
            */
                //พิมย่อๆ (remove fragment)
                //getFragmentManager().beginTransaction().remove(BlankFragment.this).commit();
                getFragmentManager().popBackStack();
            }
        });


        return rootView;
    }


}
