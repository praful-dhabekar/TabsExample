package com.praful.tabsexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

/**
 * Created by Praful Dhabekar on 8/18/2017.
 */

public class Que2 extends Fragment {

    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.que2, container, false);
    }
}
