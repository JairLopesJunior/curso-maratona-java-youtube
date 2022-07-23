package com.youtube.maratonajava.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class MainException02 {

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("src/main/java/com/youtube/maratonajava/Oexception/exception/arquivo.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("Arquivo criado " + isCreated);
    }
}
