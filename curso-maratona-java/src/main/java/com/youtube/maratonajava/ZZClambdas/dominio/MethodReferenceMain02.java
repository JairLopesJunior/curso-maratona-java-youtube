package com.youtube.maratonajava.ZZClambdas.dominio;


import com.youtube.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceMain02 {

    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
