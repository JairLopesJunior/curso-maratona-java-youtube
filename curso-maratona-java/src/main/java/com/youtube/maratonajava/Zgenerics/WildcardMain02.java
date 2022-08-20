package com.youtube.maratonajava.Zgenerics;

import java.util.ArrayList;
import java.util.List;

public class WildcardMain02 {


    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
    }

    private static void printConsulta(List<Animal> animals) {
        for(Animal a: animals) {
            a.consulta();
        }
    }
}
