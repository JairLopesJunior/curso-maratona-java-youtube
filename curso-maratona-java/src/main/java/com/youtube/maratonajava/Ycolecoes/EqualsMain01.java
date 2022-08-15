package com.youtube.maratonajava.Ycolecoes;

import com.youtube.maratonajava.Ycolecoes.dominio.Smartphone;

public class EqualsMain01 {

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "IPhone");
        Smartphone s2 = new Smartphone("1ABC1", "IPhone");
        System.out.println(s1.equals(s2));
    }
}
