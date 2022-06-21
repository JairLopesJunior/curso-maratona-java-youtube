package com.youtube.maratonajava.Gassociacao.unidirecional.muitosparaum.dominio;

public class Main {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
