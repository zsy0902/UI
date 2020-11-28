package com.example.androidclassdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button0=(Button) findViewById(R.id.button_0);
        Button button1=(Button) findViewById(R.id.button_1);
        button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "有待挖掘...",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}