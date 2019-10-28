package com.example.scorecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView score =(TextView)findViewById(R.id.score);
        final Button p3 = findViewById(R.id.p3);
        final Button p2 = findViewById(R.id.p2);
        final Button p1 = findViewById(R.id.p1);
        final Button reset = findViewById(R.id.reset);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 1;
                score.setText(""+a);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 2;
                score.setText(""+a);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 3;
                score.setText(""+a);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score.setText(""+0);
            }
        });


    }



}
