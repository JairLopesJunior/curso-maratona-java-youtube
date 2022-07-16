package com.youtube.maratonajava.Npolimorfismo.dominio.service;

import com.youtube.maratonajava.Npolimorfismo.dominio.Computador;
import com.youtube.maratonajava.Npolimorfismo.dominio.Tomate;

public class CalculadoraImpostoService {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
