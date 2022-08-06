package com.youtube.maratonajava.Uregex;

import java.util.Scanner;

public class ScannerMain02 {

    static Scanner scan;

    public static void main(String[] args) {
        // Delimitador padrão da classe Scanner é o espaço em branco
        String texto = "Levi,Eren,Mikasa,true,200";
        scan = new Scanner(texto);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            if(scan.hasNextInt()) {
                int i = scan.nextInt();
                System.out.println("Int: " + i);
            } else if(scan.hasNextBoolean()) {
                boolean b = scan.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scan.next());
            }
        }
    }
}
