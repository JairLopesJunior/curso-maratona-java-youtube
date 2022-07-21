package com.youtube.maratonajava.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class MainException01 {

    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("src/main/java/com/youtube/maratonajava/Oexception/exception/arquivo.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



















