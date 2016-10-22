package com.example.gaurav.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements top_frag.top_fragListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        bottom_frag bottomFrag = (bottom_frag)getFragmentManager().findFragmentById(R.id.fragment2);
        bottomFrag.setMeme(top,bottom);
    }
}
