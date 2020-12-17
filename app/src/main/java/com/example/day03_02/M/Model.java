package com.example.day03_02.M;

import com.example.day03_02.Contract.Contract;
import com.example.day03_02.p.Presenter;

public class Model implements Contract.ModelContract{
    private Contract.PresenterContract presenter;

    public Model(Contract.PresenterContract presenter) {
        this.presenter = presenter;
    }
}
