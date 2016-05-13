/**
 * @file ReadWebPage.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/1/2014
 *
 * The following example will read an HTML page from a URL and write the result to the console.
 */

package com.samovich.specialized.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadWebPage {

    public static void main(String[] args) {

        // Declare the String var with value
        String ulrText = "https://www.google.com/";
        // Create a BufferReader
        BufferedReader in = null;

        // Try-catch block
        try {

            /*
             * Class URL represents a Uniform Resource Locator,
             * a pointer to a "resource" on the World Wide Web.
             */
            URL url = new URL(ulrText);
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
