package com.example.mydrawabletest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView_1;
    ImageView imageView_2;
    int index =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_1);
        imageView_1  = findViewById(R.id.imageView_1);
        imageView_2  = findViewById(R.id.imageView_2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    imageView_1.setVisibility(View.INVISIBLE);
                    imageView_2.setVisibility(View.VISIBLE);
                    index = 1;
                }
                else{
                    imageView_1.setVisibility(View.VISIBLE);
                    imageView_2.setVisibility(View.INVISIBLE);
                    index = 0;
                }
            }
        });
    }
}