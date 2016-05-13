/**
 * @file SimpleHttpServer.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/06
 */

package com.samovich.specialized.httpserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/*
 * a simple static http server
*/
public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started.");
    }

    static class MyHandler implements HttpHandler {
        
        public void handle(HttpExchange t) throws IOException {
            String response = "Http Server is started on port 8000";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
        
    }
    
}
