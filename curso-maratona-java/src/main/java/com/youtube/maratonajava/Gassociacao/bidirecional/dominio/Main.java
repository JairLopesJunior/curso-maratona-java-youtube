package com.youtube.maratonajava.Gassociacao.bidirecional.dominio;

public class Main {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
