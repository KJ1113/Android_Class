package com.example.a0707_myparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 메뉴 액티비티를 띄운다. (인텐트)
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                SimpleData data = new SimpleData(100,"안녕하세요 . 안드로이드!");
                intent.putExtra("data",data);
                startActivityForResult(intent,101);
            }
        });
    }
}