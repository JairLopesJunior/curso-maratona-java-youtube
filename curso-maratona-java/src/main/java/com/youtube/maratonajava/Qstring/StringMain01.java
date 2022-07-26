package com.youtube.maratonajava.Qstring;

public class StringMain01 {

    public static void main(String[] args) {
        String nome = "Jair"; // String constant pool
        String nome2 = "Jair";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Jair");
        System.out.println(nome2 == nome3);
        System.out.println(nome2.intern());
        System.out.println(nome3.intern());
    }
}
