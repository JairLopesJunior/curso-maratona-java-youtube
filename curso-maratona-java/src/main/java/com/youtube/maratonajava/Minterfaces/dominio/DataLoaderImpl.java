package com.youtube.maratonajava.Minterfaces.dominio;

import jdk.swing.interop.SwingInterOpUtils;

public class DataLoaderImpl implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }
}
