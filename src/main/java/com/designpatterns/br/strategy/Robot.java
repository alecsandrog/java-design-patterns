package com.designpatterns.br.strategy;

public class Robot {
    private Speed speed;

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void move() {
        speed.move();
    }
}
