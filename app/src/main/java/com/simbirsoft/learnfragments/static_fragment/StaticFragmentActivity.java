package com.simbirsoft.learnfragments.static_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simbirsoft.learnfragments.R;

import butterknife.OnClick;

public class StaticFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragment);
    }
}
