package com.example.a0707_intent_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PepleManageActivity extends AppCompatActivity {


    Button button_1;
    Button button_2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peple_manage);
        button_1 = findViewById(R.id.button5);
        button_2 = findViewById(R.id.button6);
        intent = getIntent();
        if(intent != null){
            String name = intent.getExtras().getString("class_name");
            Toast.makeText(getApplicationContext(), name+" -> 고객관리" , Toast.LENGTH_SHORT ).show();
        }

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("class_name","고객관리");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),LoginActivity.class);
                intent.putExtra("class_name","고객관리");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
                finish();
            }
        });
    }
}