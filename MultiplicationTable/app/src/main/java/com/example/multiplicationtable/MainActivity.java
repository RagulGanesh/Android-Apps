package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumberDecimal;
    TextView textView2;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editTextNumberDecimal.getText().toString();
                double b=Double.parseDouble(a);
                String x="";
                for(int i=1;i<=10;i++){
                    x=""+x+b+"x"+i+"="+(b*i)+"\n";
                }
                textView2.setText(""+x);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
                editTextNumberDecimal.setText("");
            }
        });
    }
}