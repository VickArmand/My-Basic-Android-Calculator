package com.example.mybasicandroidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(myToolbar);
        EditText firstNumView = findViewById(R.id.inputValue1);
        EditText secondNumView = findViewById(R.id.inputValue2);
        TextView resultView = findViewById(R.id.result);
        Button btnAdd = findViewById(R.id.sumbutton);
        Button btnMinus = findViewById(R.id.minusbutton);
        Button btnProduct = findViewById(R.id.productbutton);
        Button btnDiv = findViewById(R.id.divbutton);
        /**
         * onclicking the add button
         */
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    float firstNum = Float.parseFloat(firstNumView.getText().toString());
                    float secondNum = Float.parseFloat(secondNumView.getText().toString());
                    String result = Float.toString(Arithmetics.addition(firstNum, secondNum));
                    resultView.setText(result);
                } catch(Exception ex){
                        Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
                    }
            }
        });
        /**
         * onclicking the divide button
         */
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float firstNum = Float.parseFloat(firstNumView.getText().toString());
                    float secondNum = Float.parseFloat(secondNumView.getText().toString());
                    String result = Float.toString(Arithmetics.division(firstNum,secondNum));
                    resultView.setText(result);
                } catch(Exception ex){
                    Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
        /**
         * onclicking the subtract button
         */
        btnMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    float firstNum = Float.parseFloat(firstNumView.getText().toString());
                    float secondNum = Float.parseFloat(secondNumView.getText().toString());
                    String result = Float.toString(Arithmetics.subtraction(firstNum,secondNum));
                    resultView.setText(result);
                } catch(Exception ex){
                    Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
        /**
         * onclicking the product button
         */
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float firstNum = Float.parseFloat(firstNumView.getText().toString());
                    float secondNum = Float.parseFloat(secondNumView.getText().toString());
                    String result = Float.toString(Arithmetics.multiplication(firstNum,secondNum));
                    resultView.setText(result);
                } catch(Exception ex){
                    Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}