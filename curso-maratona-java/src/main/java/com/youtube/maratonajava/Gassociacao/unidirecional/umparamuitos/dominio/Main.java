package com.youtube.maratonajava.Gassociacao.unidirecional.umparamuitos.dominio;

public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador.setTime(time);

        jogador.imprime();
    }
}
