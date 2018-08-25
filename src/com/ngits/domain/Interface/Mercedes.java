package com.ngits.domain.Interface;

public class Mercedes implements Car, CarAdvanced {
    @Override
    public String showCar() {
        return "Mercedes";
    }

    @Override
    public String showCarAdvanced() {
        return "Advanced Mercedes";
    }
}
