package com.designpatterns.br.strategy;

public class SpeedFast implements Speed{

    @Override
    public void move() {
        System.out.println("Running...");
    }
}
