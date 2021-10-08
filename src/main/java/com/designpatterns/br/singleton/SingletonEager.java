package com.designpatterns.br.singleton;

public class SingletonEager {

    private static SingletonEager instace = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instace;
    }
}
