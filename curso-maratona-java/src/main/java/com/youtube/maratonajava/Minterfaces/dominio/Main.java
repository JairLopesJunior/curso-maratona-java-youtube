package com.youtube.maratonajava.Minterfaces.dominio;

public class Main {

    public static void main(String[] args) {
        DataLoaderImpl dataLoader = new DataLoaderImpl();
        FileLoaderImpl fileLoader = new FileLoaderImpl();
        dataLoader.load();
        fileLoader.load();
    }
}
