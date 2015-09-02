/**
 * @file FilePathExample.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/09
 */

package com.samovich.basics.essential.io;

import java.io.File;
import java.io.IOException;

public class FilePathExample {

    public static void main(String[] args) {

        String fileName = "filePathFile.txt";
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";

        absoluteFilePath = workingDirectory + File.pathSeparator + fileName;
        System.out.println("Final filepath: " + absoluteFilePath);

        File file = new File (absoluteFilePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
