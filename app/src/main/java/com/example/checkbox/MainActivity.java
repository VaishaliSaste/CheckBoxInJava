package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Ok;
    ImageView imageView;
    TextView result;
    CheckBox male,female;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ok=findViewById(R.id.buttonOk);

        imageView=findViewById(R.id.imageExample);
        result=findViewById(R.id.textViewResult);
        male=findViewById(R.id.checkBoxmale);
        female=findViewById(R.id.checkBoxfemale);

        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(male.isChecked()){
                    result.setText("Male");
                    female.setChecked(false);

                }else {
                    result.setText("What is your Gender");
                }
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(female.isChecked()){
                    result.setText("Female");
                    male.setChecked(false);
                }else {
                    result.setText("What is your Gender");
                }
            }
        });

    }
}