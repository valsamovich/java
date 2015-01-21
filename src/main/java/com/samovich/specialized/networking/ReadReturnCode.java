/**
 * @file ReadReturnCode.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/1/2014
 *
 * HTML return codes are standardized codes which a web server returns if a
 * certain has occurred.
 */

package com.samovich.specialized.networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadReturnCode {

    public static void main() throws IOException{

        // Declare the String var with value
        String ulrText = "http://expresslocksmithfl.com/";

        /*
         * Create an Object of URL class.
         * Class URL represents a Uniform Resource Locator,
         * a pointer to a "resource" on the World Wide Web.
         */
        URL url = new URL(ulrText);

        int responseCode = ((HttpURLConnection) url.openConnection())
                .getResponseCode();
        System.out.println(responseCode);
    }
}
