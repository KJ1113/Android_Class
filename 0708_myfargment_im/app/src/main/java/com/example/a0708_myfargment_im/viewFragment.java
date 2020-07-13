package com.example.a0708_myfargment_im;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class viewFragment extends Fragment {
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_view, container, false);
        imageView = root.findViewById(R.id.imageView);
        return root;
    }
    public void setImage(int pos){
        imageView.setImageResource(pos);
    }
}