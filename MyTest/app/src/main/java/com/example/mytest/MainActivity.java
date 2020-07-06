package com.example.mytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")); startActivity(myIntent);
    }
    public void onButton2Clicked(View v) {

        Toast.makeText(this,"버튼 2가 눌러 졌어요", Toast.LENGTH_LONG).show();
        //Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000")); startActivity(myIntent);
    }
}