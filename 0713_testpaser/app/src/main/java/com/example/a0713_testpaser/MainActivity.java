package com.example.a0713_testpaser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xml_Parse();
            }
        });
    }

    private void xml_Parse() {
        String TAG = "Parsing";
        InputStream inputStream=getResources().openRawResource(R.raw.test);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        XmlPullParser xmlPullParser;

        try {
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParser = xmlPullParserFactory.newPullParser();
            xmlPullParser.setInput(reader);

            Integer eventType = new Integer(xmlPullParser.getEventType());

            while(eventType != xmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        Log.d(TAG,"xml START");
                        break;
                    case XmlPullParser.START_TAG:
                        Log.d(TAG,"START:"+xmlPullParser.getName());
                        break;
                    case XmlPullParser.END_TAG:
                        Log.d(TAG,"End Tag: "+xmlPullParser.getName());
                        break;
                    case XmlPullParser.TEXT:
                        Log.d(TAG,"Text: "+xmlPullParser.getText());
                        break;
                }
                try {
                    eventType = xmlPullParser.next();
                }catch(IOException e){
                    e.getStackTrace();
                }
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        try{
            if(reader !=null) reader.close();
            if(inputStreamReader !=null) inputStreamReader.close();
            if(inputStream !=null)inputStream.close();;

        }catch (Exception e){}
    }
}