package com.designpatterns.br.facade;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "Sao Paulo";
    }

    public String getState(String cep) {
        return "SP";
    }
}
