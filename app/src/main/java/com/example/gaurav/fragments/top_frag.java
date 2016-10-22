package com.example.gaurav.fragments;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class top_frag extends Fragment {

    private static EditText inputTop;
    private static EditText inputBottom;

    top_fragListener activityCommander;
    public interface top_fragListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (top_fragListener) activity;
        }
        catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment,container,false);

        inputTop = (EditText)view.findViewById(R.id.inputTop);
        inputBottom = (EditText)view.findViewById(R.id.inputBottom);
        final Button printbtn = (Button)view.findViewById(R.id.createbtn);

        printbtn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View view){

        activityCommander.createMeme(inputTop.getText().toString(),inputBottom.getText().toString());

    }
}