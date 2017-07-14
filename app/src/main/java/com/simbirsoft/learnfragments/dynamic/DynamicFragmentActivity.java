package com.simbirsoft.learnfragments.dynamic;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.simbirsoft.learnfragments.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        ButterKnife.bind(this);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.container1, new DynamicFragmentOne());
        transaction.add(R.id.container2, new DynamicFragmentTwo());
        transaction.commit();
    }

    @OnClick(R.id.btn_swap)
    void swap(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container1, new DynamicFragmentTwo());
        transaction.replace(R.id.container2, new DynamicFragmentOne());

//        transaction.replace(R.id.container1, getFragmentTwo());
//        transaction.replace(R.id.container2, getFragmentOne());

        transaction.commit();
    }

    private DynamicFragmentOne getFragmentOne(){
        return (DynamicFragmentOne) getSupportFragmentManager().findFragmentById(R.id.container1);
    }

    private DynamicFragmentTwo getFragmentTwo(){
        return (DynamicFragmentTwo) getSupportFragmentManager().findFragmentById(R.id.container2);
    }

    @OnClick(R.id.btn_hi)
    void hi(){
        getFragmentOne().setText("Hi!");
    }
}
