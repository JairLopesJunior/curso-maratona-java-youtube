package com.youtube.maratonajava.Ycolecoes;

import com.youtube.maratonajava.Ycolecoes.dominio.Smatphone;

public class EqualsMain01 {

    public static void main(String[] args) {

        Smatphone s1 = new Smatphone("1ABC1", "IPhone");
        Smatphone s2 = new Smatphone("1ABC1", "IPhone");
        System.out.println(s1.equals(s2));
    }
}
