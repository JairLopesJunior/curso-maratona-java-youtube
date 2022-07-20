package com.youtube.maratonajava.Npolimorfismo.dominio.service;

import com.youtube.maratonajava.Npolimorfismo.dominio.repository.Repositorio;

public class RepositorioBancoDeDadosService implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados.");
    }
}
