package com.youtube.maratonajava.ZZClambdas.dominio.service;

import com.youtube.maratonajava.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
