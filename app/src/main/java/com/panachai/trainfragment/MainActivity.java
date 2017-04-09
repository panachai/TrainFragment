package com.panachai.trainfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                BlankFragment blankFragment = new BlankFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        /*เขียนเต็มๆแบบนี้
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
         */
                transaction.replace(R.id.fragment_container, blankFragment);
                transaction.addToBackStack(null); //เพื่อให้กด Back แล้วปิด fragment ก่อน
                transaction.commit();
            }
        });

        //button two
        Button btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TwoFragment twoFragment = new TwoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_container, twoFragment);
                transaction.addToBackStack(null); //เพื่อให้กด Back แล้วปิด fragment ก่อน
                transaction.commit();
            }
        });

        //button three
        Button btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ThreeFragment threeFragment = new ThreeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, threeFragment);
                transaction.addToBackStack(null); //เพื่อให้กด Back แล้วปิด fragment ก่อน
                transaction.commit();
            }
        });

    }
}
