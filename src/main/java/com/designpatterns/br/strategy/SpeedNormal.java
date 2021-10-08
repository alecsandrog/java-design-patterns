package com.designpatterns.br.strategy;

public class SpeedNormal implements Speed {

    @Override
    public void move() {
        System.out.println("Walking...");
    }
}
