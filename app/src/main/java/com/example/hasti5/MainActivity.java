package com.example.hasti5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n00,n0,ac,plus,minus,multiplication,divison,modulas,ans,input;

    int num1,num2,sign;
    @SuppressLint("MissingInflateId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n00 = findViewById(R.id.n00);
        n0 = findViewById(R.id.n0);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        divison = findViewById(R.id.divison);
        modulas = findViewById(R.id.modulas);
        ans = findViewById(R.id.ans);
        ac = findViewById(R.id.ac);
        input = findViewById(R.id.input);


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                num1=num2=0;
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"9");
            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"00");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = input.getText().toString();
                input.setText(get+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 1;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 2;
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 3;
            }
        });
        divison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 4;
            }
        });
        modulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 5;
            }
        });
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = input.getText().toString();
                num2 = Integer.parseInt(num);

                switch (sign){
                    case 1:
                        input.setText(""+(num1+num2));
                        break;
                    case 2:
                        input.setText(""+(num1-num2));
                        break;
                }
            }
        });
    }

}