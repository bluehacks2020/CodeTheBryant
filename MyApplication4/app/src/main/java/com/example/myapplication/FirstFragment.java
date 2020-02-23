package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment{
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
       // return inflater.inflate(R.layout.fragment_first, container, false);

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        imageView = (ImageView) view.findViewById(R.id.imageViewKumintang);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), kulintangActivity.class);
                startActivity(in);
            }
        });
        return view;
    }


}
