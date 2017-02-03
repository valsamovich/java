package org.samovich.cop2800.chapter13;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.AccessMode.EXECUTE;
import static java.nio.file.AccessMode.READ;

/**
 * Filename AccessFile.java
 * Created by Valery Samovich
 * Written on 7/13/2016
 */
public class AccessFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Data.txt";
        Path filePath = Paths.get(path);
        System.out.println("Path is " + filePath.toString());
        try {
            filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
        } catch (IOException e) {
            System.out.println("File can't be used for this application");
        }
    }
}
