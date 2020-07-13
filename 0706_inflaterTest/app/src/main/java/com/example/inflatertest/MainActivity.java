package com.example.inflatertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout inner_layout;
    LayoutInflater inflater;
    Button button_1;
    Button button_2;

    // add1.xml
    Button button_3;
    TextView textView_2;
    CheckBox checkBox_1;
    CheckBox checkBox_2;
    CheckBox checkBox_3;

    // add2.xml
    Button button_4;
    RadioButton radioButton_1;
    RadioButton radioButton_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inner_layout = findViewById(R.id.inner_layout);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inner_layout.removeAllViews();
                inflater.inflate(R.layout.add1,inner_layout);

                button_3 = inner_layout.findViewById(R.id.button_3);
                textView_2 = inner_layout.findViewById(R.id.textView_2);
                checkBox_1 =inner_layout.findViewById(R.id.checkBox_1);
                checkBox_2 =inner_layout.findViewById(R.id.checkBox_2);
                checkBox_3 =inner_layout.findViewById(R.id.checkBox_3);

                button_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str ="";
                        if(checkBox_1.isChecked()){ str += "- BMW\n"; }
                        if(checkBox_2.isChecked()){ str += "- Benz\n"; }
                        if(checkBox_3.isChecked()){ str += "- 소나타\n"; }
                        textView_2.setText("좋아하는 차종은\n" +  str);
                    }
                });
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inner_layout.removeAllViews();
                inflater.inflate(R.layout.add2,inner_layout);

                radioButton_1 = inner_layout.findViewById(R.id.radioButton_1);
                radioButton_2 = inner_layout.findViewById(R.id.radioButton_2);
                button_4 = inner_layout.findViewById(R.id.button_4);

                radioButton_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButton_1.isChecked()){
                            float r = button_4.getRotation();
                            button_4.setRotation(r + 45f);
                            radioButton_1.setChecked(false);
                        }

                    }
                });
                radioButton_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButton_2.isChecked()){
                            float r = button_4.getRotation();
                            button_4.setRotation(r + 90f);
                            radioButton_2.setChecked(false);
                        }
                    }
                });
            }
        });
    }
}