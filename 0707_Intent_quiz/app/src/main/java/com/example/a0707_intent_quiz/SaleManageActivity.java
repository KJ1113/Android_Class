package com.example.a0707_intent_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaleManageActivity extends AppCompatActivity {


    Button button_1;
    Button button_2;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_manage);

        button_1 = findViewById(R.id.button9);
        button_2 = findViewById(R.id.button10);
        intent = getIntent();

        if(intent != null){
            String name = intent.getExtras().getString("class_name");
            Toast.makeText(getApplicationContext(), name+" -> 매출관리 " , Toast.LENGTH_SHORT ).show();
        }

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("class_name","매출관리");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),LoginActivity.class);
                intent.putExtra("class_name","매출관리");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
                finish();
            }
        });
    }
}