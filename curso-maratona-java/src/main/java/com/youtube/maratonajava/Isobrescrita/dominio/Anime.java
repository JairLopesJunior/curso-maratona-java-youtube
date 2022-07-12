package com.youtube.maratonajava.Isobrescrita.dominio;

public class Anime extends Object {

    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Anime: " + this.nome + " " + super.toString();
    }
}
