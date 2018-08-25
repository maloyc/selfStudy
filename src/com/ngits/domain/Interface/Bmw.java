package com.ngits.domain.Interface;

public class Bmw implements Car, CarAdvanced {
    @Override
    public String showCar() {
        return "Bmw";
    }

    @Override
    public String showCarAdvanced() {
        return "Advanced Bmw";
    }
}
