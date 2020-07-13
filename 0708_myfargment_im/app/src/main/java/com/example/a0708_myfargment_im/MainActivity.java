package com.example.a0708_myfargment_im;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements listFragment.ImageSelectionCallback {



    listFragment listFragment;
    viewFragment viewerFragment;

    int [] images = {R.drawable.iu1,R.drawable.iu2, R.drawable.iu3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        listFragment = (listFragment)manager.findFragmentById(R.id.fragment) ;
        viewerFragment= (viewFragment)manager.findFragmentById(R.id.fragment2) ;
    }

    @Override
    public void onImageSelected(int pos) {
        viewerFragment.setImage(images[pos]);
    }
}