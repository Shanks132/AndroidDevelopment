package com.example.ch1_practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText n1,n2;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();
        textView = findViewById(R.id.sum);
        //textView.setText("Good Morning");
        n1 = findViewById(R.id.Num1);
        n2 = findViewById(R.id.Num2);

        addButton = findViewById(R.id.button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // trying to print a multiplication table
                String text="";
                int number1 = Integer.parseInt(n1.getText().toString());
                for(int i=1; i<=Integer.parseInt(n2.getText().toString());i++){
                     text = text.concat(number1 + " * " + i +"="+ number1*i+"\n");
                }
                //int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                textView.setText("The table goes like: \n"+text);
            }
        });

    }
}