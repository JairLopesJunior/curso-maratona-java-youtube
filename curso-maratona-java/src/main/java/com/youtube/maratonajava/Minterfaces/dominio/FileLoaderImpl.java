package com.youtube.maratonajava.Minterfaces.dominio;

public class FileLoaderImpl implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
