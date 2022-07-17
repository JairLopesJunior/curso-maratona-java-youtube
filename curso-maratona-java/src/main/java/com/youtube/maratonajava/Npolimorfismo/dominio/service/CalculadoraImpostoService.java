package com.youtube.maratonajava.Npolimorfismo.dominio.service;

import com.youtube.maratonajava.Npolimorfismo.dominio.Produto;

public class CalculadoraImpostoService {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço:" + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
