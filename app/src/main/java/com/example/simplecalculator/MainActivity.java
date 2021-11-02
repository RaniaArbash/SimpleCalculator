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
                if ((firstNum.getText().toString().isEmpty()) || (secondNum.getText().toString().isEmpty())){
                    Toast.makeText(getApplicationContext(),"Please Enter Numbers first",Toast.LENGTH_LONG).show();

                }
                else{
                    int n1 = Integer.parseInt(firstNum.getText().toString());
                    int n2 = Integer.parseInt(secondNum.getText().toString());
                    int result = n1 + n2;
                    resultText.setText(result + "");
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Sub button clicked",Toast.LENGTH_LONG).show();
                Log.d("Calculator","Sub Button Clicked");
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator","times Button Clicked");
            }
        });
        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Divide button clicked",Toast.LENGTH_LONG).show();
                Log.d("Calculator","divide Button Clicked");
            }
        });
    }




}// MVC