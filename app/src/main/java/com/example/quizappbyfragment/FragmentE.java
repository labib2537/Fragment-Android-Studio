package com.example.quizappbyfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentE extends Fragment {

    TextView textView;
    int mark;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_e, container, false);

        View view = inflater.inflate(R.layout.fragment_c, container, false);
        perform(view);

        return view;

    }
    private void perform(View view){
        textView = view.findViewById(R.id.textView2);

    }
}