package com.youtube.maratonajava.Oexception.exception.dominio;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() {
        System.out.println("Salvando funcionário");
    }
}
