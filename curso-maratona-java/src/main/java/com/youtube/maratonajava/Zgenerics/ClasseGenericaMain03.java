package com.youtube.maratonajava.Zgenerics;

import com.youtube.maratonajava.Zgenerics.dominio.Barco;
import com.youtube.maratonajava.Zgenerics.dominio.Carro;
import com.youtube.maratonajava.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaMain03 {

    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);
        System.out.println();

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalService2.retornarObjetoAlugado(barco);
    }
}
