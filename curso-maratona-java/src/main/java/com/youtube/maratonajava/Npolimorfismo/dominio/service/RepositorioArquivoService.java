package com.youtube.maratonajava.Npolimorfismo.dominio.service;

import com.youtube.maratonajava.Npolimorfismo.dominio.repository.Repositorio;

public class RepositorioArquivoService implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo.");
    }
}
