package com.example.quizappbyfragment;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button next;
    public static int mark = 0;
    final static String finalMark ="final Mark";
    Fragment fragment;
    TextView textView;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new FragmentA();
        transit(fragment);
        textView = findViewById(R.id.textView2);
        next = findViewById(R.id.nextBtn);
        next.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        count++;
        if(count==2){
            fragment = new FragmentB();
            transit(fragment);
            mark=mark+FragmentA.t;
        }
        else if(count==3){
            fragment = new FragmentC();
            transit(fragment);
            mark=mark+FragmentB.t2;
        }
        else if(count==4){
            fragment = new FragmentD();
            transit(fragment);
            mark=mark+FragmentC.t3;

        }
        else if(count==5){
            //fragment = new FragmentE();
            //transit(fragment);
            mark=mark+FragmentD.t4;
            Intent intent = new Intent(this, Result.class);
            intent.putExtra(finalMark,mark);
            startActivity(intent);
            //textView.setText("You have got "+mark+" marks out of 20");
            //next.setText("Try again");


        }

        /*else if(count==6){
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    mark = 0;

        }*/

    }
    void transit(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentID,fragment);
        transaction.commit();
    }

}
