package com.youtube.maratonajava.ZZClambdas.dominio;

import com.youtube.maratonajava.ZZClambdas.dominio.Anime;
import com.youtube.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceMain01 {

    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
    }
}
