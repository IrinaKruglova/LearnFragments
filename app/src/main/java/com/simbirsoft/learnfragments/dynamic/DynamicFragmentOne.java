package com.simbirsoft.learnfragments.dynamic;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simbirsoft.learnfragments.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DynamicFragmentOne extends Fragment {

    @BindView(R.id.text)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dynamic_one, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    public void setText(String text){
        textView.setText(text);
    }
}
