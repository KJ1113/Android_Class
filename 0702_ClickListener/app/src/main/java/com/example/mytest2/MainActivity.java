package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Button button2;
    ConstraintLayout constraintlayout;

    private int condition=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml 파일의 구성요소를 인플레이션한다.
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        constraintlayout = findViewById(R.id.contnier);

        //button.setText("안녕하세요~~!!");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(condition == 1 ){
                    textView.setText("아령하세여");
                    textView.setTextColor(Color.RED);
                    textView.setBackgroundColor(Color.YELLOW);
                    condition= 2;
                }
                else{
                    textView.setText("안녕히가세요");
                    textView.setTextColor(Color.BLUE);
                    condition=1;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintlayout.setBackgroundColor(Color.RED);
            }
        });
    }
}