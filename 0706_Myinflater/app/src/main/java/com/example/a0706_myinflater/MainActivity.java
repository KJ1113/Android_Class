package com.example.a0706_myinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout inner_layout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_1);
        inner_layout = findViewById(R.id.container);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // container 레이아웃에 sub.xml 을 인플레이션 한다.

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub,inner_layout);
                // inner_layout 안에 sub 레이아웃을 추가함
                CheckBox checkBox = inner_layout.findViewById(R.id.checkBox2);
                checkBox.setText("변경되었어요.");
            }
        });
    }
}