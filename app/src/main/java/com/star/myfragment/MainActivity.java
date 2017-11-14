package com.star.myfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;
    Fragment1 frag1;
    Fragment2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        frag1 = (Fragment1) fm.findFragmentById(R.id.fragment);
        frag2 = (Fragment2) fm.findFragmentById(R.id.fragment2);
        showFragment1();
    }

    public void showFragment1() {
        ft = fm.beginTransaction();
        ft.hide(frag2).show(frag1).commit();   // 隱藏frag2  只顯示frag1
    }

    public void showFragment2() {
        ft = fm.beginTransaction();
        ft.hide(frag1).show(frag2).commit();   // 隱藏frag1  只顯示frag2
    }
    //Fragment的監聽器
//    Fragment1.OnFragmentInteractionListener listener1 = new Fragment1.OnFragmentInteractionListener() {
//        @Override
//        public void onFragmentInteraction(Uri uri) {
//
//        }
//    };
//
//    Fragment2.OnFragmentInteractionListener listener2 = new Fragment2.OnFragmentInteractionListener() {
//        @Override
//        public void onFragmentInteraction(Uri uri) {
//
//        }
//    };
}
