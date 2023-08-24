package com.example.uniconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button); // button to press
        textView = findViewById(R.id.textView2);  // the calculation to be printed
        editText = findViewById(R.id.editTextText);
        //button.setOnClickListener(new View.OnClickListener() {
           //@Override
            /*public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi, Click listener worked! ", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                double kg = Double.parseDouble(s);
                double pound = kg * 2.205d ;
                String answer = "The corresponding value in pound is: " + pound;
                textView.setText(answer);

            }
        });
             */
    }
    public void calculate(View view){
        String s = editText.getText().toString();
        double kg = Double.parseDouble(s);
        double pound = kg * 2.205d ;
        String answer = "The corresponding value in pound is: " + pound;
        textView.setText(answer);
        Toast.makeText(this, "Thanks for using this app:", Toast.LENGTH_SHORT).show();
    }
}