package com.example.gaurav.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class bottom_frag extends Fragment {

    private static TextView toptxt;
    private static TextView bottomtxt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment,container,false);

        toptxt = (TextView)view.findViewById(R.id.toptxt);
        bottomtxt = (TextView)view.findViewById(R.id.bottomtxt);

        return view;
    }

    public void setMeme(String top, String bottom){
        toptxt.setText(top);
        bottomtxt.setText(bottom);
    }
}
