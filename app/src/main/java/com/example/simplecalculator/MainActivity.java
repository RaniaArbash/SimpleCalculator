package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// code to mange UI
    // R.java resource ids// auto generated // I don't have to change it
    Button add;
    Button sub;
    Button times;
    Button divid;

    EditText firstNum;
    EditText secondNum;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.plus_btu);
        sub = (Button) findViewById(R.id.minus_btu);
        divid = (Button) findViewById(R.id.divid_btu);
        times = (Button) findViewById(R.id.times_btu);

        firstNum = (EditText) findViewById(R.id.num1);
        secondNum = (EditText) findViewById(R.id.num2);

        resultText = (TextView) findViewById(R.id.restult_txt);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndCalc(1);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndCalc(2);
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndCalc(3);
            }
        });
        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndCalc(4);
            }
        });
    }

    void checkAndCalc(int op){// (1,+) (2,-)(3,*)(4,/)
        String num1Str = firstNum.getText().toString();// I am sure it contain a numer
        String num2Str = secondNum.getText().toString();
        if ((firstNum.getText().toString().isEmpty()) || (secondNum.getText().toString().isEmpty())){
            Toast.makeText(getApplicationContext(),"Please Enter Numbers first",Toast.LENGTH_LONG).show();

        }else {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            if (op == 1) {
                resultText.setText(String.valueOf(num1 + num2));
            } else if (op == 2) {
                resultText.setText(String.valueOf(num1 - num2));

            } else if (op == 3) {
                resultText.setText(String.valueOf(num1 * num2));

            } else if (op == 4) {
                resultText.setText(String.valueOf(num1 / num2));

            }
        }
    }


}// MVC