package com.simbirsoft.learnfragments.static_fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simbirsoft.learnfragments.R;

import butterknife.ButterKnife;

public class StaticFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_static, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
