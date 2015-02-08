/**
 * @file FileDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/07
 */

package com.samovich.basics.essential.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
            
    public static void main(String[] args) throws IOException  {
        
        String path = "C:\\Users\\Samovich\\Development\\java-technologies\\src\\main\\resources\\com\\samovich\\basics\\essential\\io\\";
        File file = new File(path + "HelloWorld.txt");
        
        if(file.createNewFile()) {
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }
    }
}
