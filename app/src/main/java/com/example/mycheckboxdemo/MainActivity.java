 package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milk,sugar,water;
    private Button showButton;
    private TextView textView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        milk=findViewById(R.id.milkCheckBoxId);
        sugar=findViewById(R.id.sugarCheckBoxId);
        water=findViewById(R.id.waterCheckBoxID);

        showButton=findViewById(R.id.ButtonViewId);
        textView=findViewById(R.id.resultTextviewID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder=new StringBuilder();

                if (milk.isChecked()){
                    String value=milk.getText().toString();
                    stringBuilder.append(value + "is Ordered\n");

                }
                if (sugar.isChecked()){
                    String value=sugar.getText().toString();
                    stringBuilder.append(value + "is Ordered\n");

                }
                if (water.isChecked()){
                    String value=water.getText().toString();
                    stringBuilder.append(value + "is Ordered");

                }

                textView.setText(stringBuilder);

            }
        });


    }
}