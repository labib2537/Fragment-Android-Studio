package com.example.quizappbyfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView;
    Button tryAgain;
   int mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = findViewById(R.id.textView2);
        tryAgain = findViewById(R.id.tryBtn);
        Intent intent = getIntent();
        mark = intent.getIntExtra(MainActivity.finalMark,0);
        textView.setText("You have got "+mark+" marks out of 20");
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}