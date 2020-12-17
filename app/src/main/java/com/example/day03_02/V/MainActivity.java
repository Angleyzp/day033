package com.example.day03_02.V;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.day03_02.BaseActivity.BaseActivity;
import com.example.day03_02.Contract.Contract;
import com.example.day03_02.R;
import com.example.day03_02.p.Presenter;

public class MainActivity extends BaseActivity<Presenter> implements Contract.ViewContract {


    private RecyclerView recy;

    @Override
    protected void initView() {
        recy = findViewById(R.id.recy);
    }

    @Override
    protected void initData() {
        per.getData();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public Presenter getPer() {
        return new Presenter(this);
    }
}