package com.samovich.technologies.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author samov004
 * @version 1.0.0
 * @file FileName.java
 * @date 11/16/15
 */
public class ReadWordsInFile {

    public static void main(String[] args) {

        // Location of the resource
        String resource = "/Users/samov004/GitHub/java-technologies/" +
                "src/main/resources/com/samovich/programs/countries_of_the_wolrd.txt";

        try{
            // Create BufferedReader
            BufferedReader bufferedReader = new BufferedReader(new FileReader(resource));

            // Create ArrayList<String>
            ArrayList<String> words = new ArrayList<>();

            // Start reading data into String variable lineJustFetched
            String lineJustFetched = null;
            String[] wordsArray;

            // Iterate over the String[] produced. Check if the token you want
            // to enter into the ArrayList is not ""
            while(true){
                lineJustFetched = bufferedReader.readLine();
                if(lineJustFetched == null){
                    break;
                }else{
                    wordsArray = lineJustFetched.split("\t");
                    for(String each : wordsArray){
                        if(!"".equals(each)){
                            words.add(each);
                        }
                    }
                }
            }

            for(String each : words){
                System.out.println(each);
            }

            bufferedReader.close();

            System.out.println();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
