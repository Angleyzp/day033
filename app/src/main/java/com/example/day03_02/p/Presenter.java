package com.example.day03_02.p;

import com.example.day03_02.Contract.Contract;
import com.example.day03_02.M.Model;
import com.example.day03_02.V.MainActivity;

public class Presenter implements Contract.PresenterContract {


    private Contract.ViewContract viewContract;
    private Contract.ModelContract modelContract;

    public Presenter(Contract.ViewContract viewContract) {
        this.viewContract = viewContract;
        modelContract = new Model(this);
    }

    public void getData() {

    }
}
