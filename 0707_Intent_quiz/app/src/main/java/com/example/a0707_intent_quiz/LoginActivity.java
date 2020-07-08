package com.example.a0707_intent_quiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intent = getIntent();

        if(intent != null){
            String name = intent.getExtras().getString("class_name");
            Toast.makeText(getApplicationContext(), name+" -> 로그인" , Toast.LENGTH_SHORT ).show();
        }

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                intent.putExtra("class_name","로그인");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
                finish();
            }
        });
    }
}