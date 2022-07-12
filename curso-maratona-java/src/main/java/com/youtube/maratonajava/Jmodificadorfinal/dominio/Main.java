package com.youtube.maratonajava.Jmodificadorfinal.dominio;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);
    }
}
