package com.example.a0706_myinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_1);
        layout = findViewById(R.id.container);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // container 레이아웃에 sub.xml 을 인플레이션 한다.
                
            }
        });
    }
}