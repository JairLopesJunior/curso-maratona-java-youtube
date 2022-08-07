package com.youtube.maratonajava.Vio;

import java.io.File;
import java.io.IOException;

public class FileDirectory01 {

    public static void main(String[] args) throws IOException {

        File directory = new File("pasta");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println(isDirectoryCreated);

        // 1º Primeira forma de criar arquivo
        File fileDirectory = new File("C:\\Users\\Oem\\Documents\\Projetos GIT-HUB\\curso-maratona-java-youtube\\curso-maratona-java\\pasta/arquivo.txt");
        boolean isFileCreated = fileDirectory.createNewFile();
        System.out.println(isFileCreated);

        // 2º Primeira forma de criar arquivo
        File fileDirectory2 = new File(directory, "arquivo2.txt");
        boolean isFileCreated2 = fileDirectory2.createNewFile();
        System.out.println(isFileCreated2);

        File fileRenamed = new File(directory, "arquivo_renomeado.txt");
        boolean isRenamed = fileDirectory2.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}
