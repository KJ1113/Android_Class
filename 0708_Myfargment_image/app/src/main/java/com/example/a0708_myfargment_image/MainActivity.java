package com.example.a0708_myfargment_image;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements List_Fragment.ImageSelectionCallback {


    List_Fragment listFragment;
    ViewerFragment viewerFragment;

    int [] images = {R.drawable.iu1 ,R.drawable.iu2,R.drawable.iu3 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        listFragment = (List_Fragment)manager.findFragmentById(R.id.listfragment) ;
        viewerFragment= (ViewerFragment)manager.findFragmentById(R.id.viewerfragment) ;
    }
    @Override
    public void onImageSelected(int pos) {
        viewerFragment.setImage(images[pos]);
    }
}