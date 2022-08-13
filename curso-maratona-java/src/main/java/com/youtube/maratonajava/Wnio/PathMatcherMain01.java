package com.youtube.maratonajava.Wnio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherMain01 {

    public static void main(String[] args) {

        Path path1 = Paths.get("file.bkp");
        Path path11 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1, "glob:*bkp"); // So considera na raiz
        matches(path11, "glob:**bkp"); // Considera ignorando tudo que tem na esquerda
        matches(path1, "glob:**{bkp,txt,java}"); // Buscando pelas três extensões
        matches(path2, "glob:**{bkp,txt,java}"); // Buscando pelas três extensões
        matches(path3, "glob:**{bkp,txt,java}"); // Buscando pelas três
        matches(path1, "glob:**???"); // Ter exatamente três letras depois do ponto
        matches(path2, "glob:**???"); // Ter exatamente três letras depois do ponto
        matches(path3, "glob:**???"); // Ter exatamente três letras depois do ponto
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}















