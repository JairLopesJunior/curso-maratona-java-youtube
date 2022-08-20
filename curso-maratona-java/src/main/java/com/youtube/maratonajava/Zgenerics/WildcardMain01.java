package com.youtube.maratonajava.Zgenerics;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildcardMain01 {


    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        //printConsulta(cachorros);
        //printConsulta(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for(Animal a: animals) {
            a.consulta();
        }
        animals[0] = new Gato();
    }
}
