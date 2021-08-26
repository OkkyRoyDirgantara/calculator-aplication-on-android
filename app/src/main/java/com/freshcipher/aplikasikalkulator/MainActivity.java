package com.freshcipher.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first_number, second_number;
    Button add, subtract, multiply, divide, reset;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_number = findViewById(R.id.input_first_number);
        second_number = findViewById(R.id.input_second_number);
        add = findViewById(R.id.button_add);
        subtract = findViewById(R.id.button_subtract);
        multiply = findViewById(R.id.button_multiply);
        divide = findViewById(R.id.button_divide);
        result = findViewById(R.id.text_result);
        reset = findViewById(R.id.button_reset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((first_number.getText().length()>0) && (second_number.getText().length()>0)){
                    double number1 = Double.parseDouble(first_number.getText().toString());
                    double number2 = Double.parseDouble(second_number.getText().toString());
                    double resultNumber = number1 + number2;
                    result.setText(Double.toString(resultNumber));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((first_number.getText().length()>0) && (second_number.getText().length()>0)){
                    double number1 = Double.parseDouble(first_number.getText().toString());
                    double number2 = Double.parseDouble(second_number.getText().toString());
                    double resultNumber = number1 - number2;
                    result.setText(Double.toString(resultNumber));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((first_number.getText().length()>0) && (second_number.getText().length()>0)){
                    double number1 = Double.parseDouble(first_number.getText().toString());
                    double number2 = Double.parseDouble(second_number.getText().toString());
                    double resultNumber = number1 * number2;
                    result.setText(Double.toString(resultNumber));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((first_number.getText().length()>0) && (second_number.getText().length()>0)){
                    double number1 = Double.parseDouble(first_number.getText().toString());
                    double number2 = Double.parseDouble(second_number.getText().toString());
                    double resultNumber = number1 / number2;
                    result.setText(Double.toString(resultNumber));
                }else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_number.setText("");
                second_number.setText("");
                result.setText("0");
                first_number.requestFocus();
            }
        });
    }
}