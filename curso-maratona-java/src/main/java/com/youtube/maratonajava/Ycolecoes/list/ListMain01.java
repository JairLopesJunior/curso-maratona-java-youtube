package com.youtube.maratonajava.Ycolecoes.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain01 {

    public static void main(String[] args) {

        List nomes = new ArrayList(); // Até a versão 1.4 era feito desta forma
        nomes.add("Jair");
        nomes.add("DevDojo Academy");
        //nomes.add(1);
        /*for(Object nome: nomes) {
            System.out.println(nome);
        }*/

        List<String> nomess = new ArrayList<>(); // Forçando em tempo de compilação a lista ser de String (A partir da versão 1.5)
        nomess.add("Jair"); // Adiciona na lista
        nomess.add("João");
        nomess.add("Carlos");
        nomess.remove("Jair"); // Remove da lista
        nomess.remove(0); // Remove da lista por indice
        nomess.addAll(nomes); // Junta duas listas
        nomess.forEach(System.out::println);
    }
}
