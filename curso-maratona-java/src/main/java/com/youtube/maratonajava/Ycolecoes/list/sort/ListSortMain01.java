package com.youtube.maratonajava.Ycolecoes.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortMain01 {

    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Atack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        Collections.sort(mangas);

        mangas.forEach(System.out::println);
    }
}
