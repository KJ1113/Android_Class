package com.example.a0706_myintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 =findViewById(R.id.button_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 메뉴 액티비티를 띄운다
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                //startActivity(); // 그냥 실행
                startActivityForResult(intent,101); // 실행하고 결과 값받아오기
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 101){
            //Toast.makeText(getApplicationContext(), "onActivityResult 메소드 호출됨. 요청 코드 : " + requestCode + ", 결과 코드 : " + resultCode, Toast. LENGTH_LONG ).show();
        }
        if(resultCode == RESULT_OK ){
            String name = data.getExtras().getString("name");
            String age = data.getExtras().getString("age");
            Toast.makeText(getApplicationContext(), "응답으로 전달된 name : " + name +" " +age, Toast.LENGTH_LONG ).show();
        }
    }
}