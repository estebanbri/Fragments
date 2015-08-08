//fragments tuto 23
package com.estebanb123.quintaapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends Fragment {


    private static TextView topMemeText;
    private static TextView bottomMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topMemeText = (TextView) view.findViewById(R.id.topTextInput);
        bottomMemeText = (TextView) view.findViewById(R.id.bottomTextInput);


        return view;
    }

    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);

    }

}