package com.example.a0710_testservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.a0710_testservice.MainActivity;

public class MyService extends Service {

    public static final String tag = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(tag,"onCreate Call");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) { //key값이 넘어온 것이 있으면
        Log.d(tag,"onStartCommand Call");
        String command;
        String name;
        if(intent == null){
            return Service.START_STICKY;
        } else {
            processCommand(intent);
        }

        return super.onStartCommand(intent, flags, startId);
    }

    private void processCommand(Intent intent) {
        String command = intent.getStringExtra("commmand");
        String name = intent.getStringExtra("name");

        Log.d(tag,"command : "+command+", name : "+name);

        for(int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d(tag,"waiting "+i+" seconds.");

        }

        //메인액티비티에 인텐트 객체를 보낸다.
        Intent showIntent = new Intent(getApplicationContext(), MainActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("command","show");
        showIntent.putExtra("name",name+" from sevice.");
        startActivity(showIntent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy Call");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}