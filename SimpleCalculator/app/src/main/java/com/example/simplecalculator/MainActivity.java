package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumberDecimal2;
    EditText editTextNumberDecimal4;
    TextView textView4;
    TextView textView5;
    TextView textView2;
    Button button;
    Button button2;
    RadioGroup radioGroup;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumberDecimal2=findViewById(R.id.editTextNumberDecimal2);
        editTextNumberDecimal4=findViewById(R.id.editTextNumberDecimal4);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView2=findViewById(R.id.textView2);
        radioGroup=findViewById(R.id.radioGroup);
        radioButton6=findViewById(R.id.radioButton6);
        radioButton7=findViewById(R.id.radioButton7);
        radioButton8=findViewById(R.id.radioButton8);
        radioButton9=findViewById(R.id.radioButton9);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c,d,result;
                String a=editTextNumberDecimal2.getText().toString();
                String b=editTextNumberDecimal4.getText().toString();

                c=Double.parseDouble(a);
                d=Double.parseDouble(b);

//                int Id=radioGroup.getCheckedRadioButtonId();
//                radioButton=findViewById(Id);

//                Toast.makeText(getApplicationContext(), "You chose "+radioButton.getText(), Toast.LENGTH_SHORT).show();

//                String e=radioButton.getText().toString();
//                Toast.makeText(getApplicationContext(),"Result is : "+(c+d), Toast.LENGTH_SHORT).show();

                if(radioButton6.isChecked()){
                    result=c+d;
                    textView5.setText(""+result);
                }
                else if(radioButton7.isChecked()){
                    result=c-d;
                    textView5.setText(""+result);
                }
                else if(radioButton8.isChecked()){
                    result=c*d;
                    textView5.setText(""+result);
                }
                else{
                    if(d==0){
                        Toast.makeText(getApplicationContext(), "Cannot divide by zero!!!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        result=c/d;
                        textView5.setText(""+result);
                    }

                }


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumberDecimal2.setText("");
                editTextNumberDecimal4.setText("");
                radioGroup.clearCheck();
                textView5.setText("");
            }
        });
    }
}