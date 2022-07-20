package com.youtube.maratonajava.Npolimorfismo.dominio.service;

import com.youtube.maratonajava.Npolimorfismo.dominio.repository.Repositorio;

public class RepositorioMemoriaService implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória.");
    }
}
