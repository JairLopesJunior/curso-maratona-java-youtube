package com.youtube.maratonajava.Npolimorfismo.dominio;

import com.youtube.maratonajava.Npolimorfismo.dominio.service.CalculadoraImpostoService;

public class Main {

    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadoraImpostoService.calcularImpostoComputador(computador);
        CalculadoraImpostoService.calcularImpostoTomate(tomate);
    }
}
