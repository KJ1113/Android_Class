package com.example.hustar_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_1;
    Button button_2;
    ImageView ImageView_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        ImageView_1 = findViewById(R.id.imageView_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float r = ImageView_1.getRotation();
                ImageView_1.setRotation(r - 10f);
                //Toast.makeText(getApplicationContext(), "L", Toast.LENGTH_LONG).show();
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float r = ImageView_1.getRotation();
                ImageView_1.setRotation(r + 10f);
                //Toast.makeText(getApplicationContext(), "R", Toast.LENGTH_LONG).show();
            }
        });
    }

}