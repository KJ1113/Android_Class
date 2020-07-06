package com.example.a0706_myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {


    Button button_2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_2 = findViewById(R.id.button_2);
        editText = findViewById(R.id.editText);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                String input = editText.getText().toString();
                String y ="19";
                y += input.charAt(0);
                y += input.charAt(1);

                int age = 2020 - Integer.parseInt(y);
                intent.putExtra("name","윤커재");
                intent.putExtra("age",Integer.toString(age));
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}