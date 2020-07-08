package com.example.a0707_intent_quiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String i = "start";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_1 = findViewById(R.id.button2);
        Button button_2 = findViewById(R.id.button3);
        Button button_3 = findViewById(R.id.button4);

        if(i.equals("start")){
            Toast.makeText(getApplicationContext(),i , Toast.LENGTH_SHORT ).show();
            i = "non_start";
        }
        else{
            Intent i = getIntent();
            String n  = i.getExtras().getString("class_name");
            Toast.makeText(getApplicationContext(), n+" -> 메뉴" , Toast.LENGTH_SHORT ).show();
        }

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PepleManageActivity.class);
                intent.putExtra("class_name","메뉴");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SaleManageActivity.class);
                intent.putExtra("class_name","메뉴");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ProductManageActivity.class);
                intent.putExtra("class_name","메뉴");
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK ){
            String name = data.getExtras().getString("class_name");
            Toast.makeText(getApplicationContext(), name+" -> 메뉴 " , Toast.LENGTH_SHORT ).show();
        }
    }

}