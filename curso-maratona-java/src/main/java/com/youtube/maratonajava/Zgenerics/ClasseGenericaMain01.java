package com.youtube.maratonajava.Zgenerics;

import com.youtube.maratonajava.Zgenerics.dominio.Carro;
import com.youtube.maratonajava.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaMain01 {

    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println();
        System.out.println("Usando o carro por um mês...");
        System.out.println();
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
