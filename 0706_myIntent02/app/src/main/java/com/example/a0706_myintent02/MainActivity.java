package com.example.a0706_myintent02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText_1;
    Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_1 =findViewById(R.id.editText_1);

        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText_1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
                startActivity(intent);
            }
        });
    }
}