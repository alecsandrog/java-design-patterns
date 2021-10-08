package com.designpatterns.br;

import com.designpatterns.br.facade.Facade;
import com.designpatterns.br.singleton.SingletonEager;
import com.designpatterns.br.singleton.SingletonLazy;
import com.designpatterns.br.singleton.SingletonLazyHolder;
import com.designpatterns.br.strategy.Robot;
import com.designpatterns.br.strategy.SpeedFast;
import com.designpatterns.br.strategy.SpeedNormal;

public class Test {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Facade
        Facade facade = new Facade();
        facade.migrateClient("Anna", "77-7777");

        //Strategy
        SpeedNormal normal = new SpeedNormal();
        SpeedFast fast = new SpeedFast();

        Robot robot = new Robot();
        robot.setSpeed(normal);
        robot.move();
        robot.move();
        robot.setSpeed(fast);
        robot.move();
        robot.move();
        robot.move();
    }
}
