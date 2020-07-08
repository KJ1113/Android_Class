package com.example.a0707_mylifecyecle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="Cycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate 호출");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume 호출");
    }
}