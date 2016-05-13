/**
 * @file HttpClientTutorial.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 *
 * Simple application that downloads a page using HttpClient
 */

package com.samovich.specialized.httpclient;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.*;

public class HttpClientTutorial {

    private static String url = "http://www.apache.org/";

    public static void main(String[] args) {

        // Create an instance of HttpClient.
        HttpClient client = new HttpClient();

        /*
         * The GetMethod means retrieve whatever information (in the form of
         * an entity) is identified by the Request-URI. Code - Create a method
         * instance.
         */
        GetMethod method = new GetMethod(url);

        // Provide custom retry handler is necessary.
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));

        try {
            // Execute the method.
            int statusCode = client.executeMethod(method);

            if(statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + method.getStatusLine());
            }

            // Read the response body
            byte[] responseBody = method.getResponseBody();

            /*
             * 1. Deal with the response. 2. Use caution: ensure correct
             * character encoding and is not binary data.
             */
            System.out.println(new String(responseBody));

        } catch(HttpException e) {
            System.out.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch(IOException e) {
            System.err.println("Fatal transport error: " + e.getMessage());
        } finally {

            // Important: Release the connection!
            method.releaseConnection();
        }
    }
}
