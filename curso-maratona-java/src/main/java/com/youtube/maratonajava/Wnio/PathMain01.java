package com.youtube.maratonajava.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain01 {

    public static void main(String[] args) {

        // 1º Forma para pegar o Path
        Path p1 = Paths.get("C:\\Users\\Oem\\Documents\\Projetos GIT-HUB\\curso-maratona-java-youtube\\curso-maratona-java\\file.txt");

        // 2º Forma para pegar o Path
        Path p2 = Paths.get("C:\\Users\\Oem\\Documents\\Projetos GIT-HUB\\curso-maratona-java-youtube\\curso-maratona-java","file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
    }
}
