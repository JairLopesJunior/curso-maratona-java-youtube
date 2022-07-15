package com.youtube.maratonajava.Minterfaces.dominio;

import jdk.swing.interop.SwingInterOpUtils;

public class DataLoaderImpl implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
}
