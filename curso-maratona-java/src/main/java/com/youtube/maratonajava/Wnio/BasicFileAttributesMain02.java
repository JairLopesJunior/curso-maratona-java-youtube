package com.youtube.maratonajava.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesMain02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime modifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime " + creationTime);
        System.out.println("ModifiedTime " + modifiedTime);
        System.out.println("LastAccessTime " + lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastAccessTime, newCreationTime, creationTime);

        basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        creationTime = basicFileAttributes.creationTime();
        modifiedTime = basicFileAttributes.lastModifiedTime();
        lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime " + creationTime);
        System.out.println("ModifiedTime " + modifiedTime);
        System.out.println("LastAccessTime " + lastAccessTime);
    }
}
