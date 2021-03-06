package com.youtube.maratonajava.Pwrapper;

public class WrapperMain01 {

    public static void main(String[] args) {
        // TIPOS PRIMITIVOS
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // TIPOS WRAPPERS
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // Unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = new Integer("4");
        boolean verdadeiro = Boolean.parseBoolean("True"); // CaseSensitive
    }
}
