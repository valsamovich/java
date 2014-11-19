/**
 * @file HttpClientTutorial.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 */

package com.valerysamovich.java.advanced.httpclient;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpClientTutorial {

    private static String url = "http://www.apache.org/";

    public static void main(String[] args) {

        // Create an instance of HttpClient
        HttpClient client = new HttpClient();

        // Create a method instance
        GetMethod method = new GetMethod();

        // Provide custom retry handler is necessary
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));
    }
}
