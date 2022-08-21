package com.youtube.maratonajava.Zgenerics;

import com.youtube.maratonajava.Zgenerics.dominio.Barco;
import java.util.List;

public class MetodoGenericoMain01 {

    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
        criarERetornarArrayComUmObjeto(new Barco("Canoa Marota"));
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> T criarERetornarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
        return list.get(0);
    }
}

//class DoisAtributos<T, X, I> {
//
//    private T t;
//    private X x;
//    private I i;
//}
