package com.youtube.maratonajava.ZZAclassesinternas;

import com.youtube.maratonajava.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesMain02 {

    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return 0;
            }
        });
        System.out.println(barcoList);
    }
}















