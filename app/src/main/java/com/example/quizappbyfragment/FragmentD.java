package com.example.quizappbyfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FragmentD extends Fragment {

    RadioButton r1,r2,r3,r4;
    RadioGroup rg;
    String answer = "Facebook";
    public static int t4 ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d, container, false);
        perform(view);

        return view;
    }
    private void perform(View view) {
        rg = view.findViewById(R.id.group4ID);
        r1 = view.findViewById(R.id.fourRdFour);
        r2 = view.findViewById(R.id.fourRdtwo);
        r3 = view.findViewById(R.id.fourRdThree);
        r4 = view.findViewById(R.id.fourRdFour);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    if(r1.getText().toString().equals(answer)){
                        t4 = 5;
                    }
                    else{
                        t4 = 0;
                    }
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r2.getText().toString().equals(answer)){
                        t4 = 5;
                    }
                    else{
                        t4 = 0;
                    }
                }
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r3.getText().toString().equals(answer)){
                        t4 = 5;
                    }
                    else{
                        t4 = 0;
                    }
                }
            }
        });
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r4.getText().toString().equals(answer)){
                        t4 = 5;
                    }
                    else{
                        t4 = 0;
                    }
                }
            }
        });
    }

}
