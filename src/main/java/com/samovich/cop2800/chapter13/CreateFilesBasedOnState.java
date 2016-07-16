package com.samovich.cop2800.chapter13;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * Filename CreateFilesBasedOnState.java
 * Created by Valery Samovich
 * Written on 7/15/2016
 */
public class CreateFilesBasedOnState {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        // accept user input with scanner
        Scanner input = new Scanner(System.in);

        // program uses two path objects to hold records
        // for in-state and out-of-state customers
        Path inStateFile = Paths.get("C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\InStateCuts.txt");
        Path outOfStateFile = Paths.get("C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\OutOfStateCuts.txt");

        // build a string that can be used to format the empty files
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "\t";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter +
                NAME_FORMAT + delimiter +
                BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();

        // declarations for two FileChannel references
        FileChannel fcIn = null;
        FileChannel fcOut = null;
        String idString;
        int id; String name;
        String state;
        double balance;
        final String QUIT = "999";

        // method that creates empty files into which randomly placed record
        createEmptyFile(inStateFile, s);
        createEmptyFile(outOfStateFile, s);

        // adding data entry capability to the program
        try {
            // set up the FileChannel references for both
            // the in-state and out-of-state files
            fcIn = (FileChannel)Files.newByteChannel(inStateFile, CREATE, WRITE);
            fcOut = (FileChannel)Files.newByteChannel(outOfStateFile, CREATE, WRITE);
            // prompt the user for a customer account number
            System.out.print("Enter customer account number >> ");
            idString = input.nextLine();
            while(!idString.equals(QUIT)){
                id = Integer.parseInt(idString);
                // prompt the user for a customer name, state, balance
                System.out.print("Enter name for customer >> ");
                name = input.nextLine();
                StringBuilder sb = new StringBuilder(name);
                sb.setLength(NAME_LENGTH);
                name = sb.toString();
                System.out.print("Enter state >> ");
                state = input.nextLine();
                System.out.print("Enter balance >> ");
                balance = input.nextDouble();
                input.nextLine();
                DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
                // construct the constructed string to an array of bites
                byte[] data = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                if(state.equals(HOME_STATE)) {
                    fcIn.position(id * RECSIZE);
                    fcIn.write(buffer);
                } else {
                    fcOut.position(id * RECSIZE);
                    fcOut.write(buffer);
                }
                System.out.print("Enter next customer account number or " +
                        QUIT + " to quit >> ");
                idString = input.nextLine();
            }
            fcIn.close();
            fcOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to create an empty file
     * @param file
     * @param s
     */
   public static void createEmptyFile(Path file, String s){
        final int NUMERECS = 1000;
       try {
           OutputStream outputStr = new BufferedOutputStream(
                   Files.newOutputStream(file, CREATE));
           BufferedWriter writer = new BufferedWriter(
                   new OutputStreamWriter(outputStr));
           for(int count = 0;count > NUMERECS; ++count){
               writer.write(s, 0, s.length());
           }
           writer.close();
       } catch(Exception e) {
           System.out.println("Error message: " + e);
       }
   }
}
