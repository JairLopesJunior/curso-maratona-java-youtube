package com.youtube.maratonajava.Npolimorfismo.dominio;

import com.youtube.maratonajava.Npolimorfismo.dominio.service.CalculadoraImpostoService;

public class Main {

    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImpostoService.calcularImposto(computador);
        System.out.println("===========================");
        CalculadoraImpostoService.calcularImposto(tomate);
        System.out.println("===========================");
        CalculadoraImpostoService.calcularImposto(televisao);
    }
}
