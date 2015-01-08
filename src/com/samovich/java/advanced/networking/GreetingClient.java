/**
 * @file GreetingClient.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/1/2014
 * 
 * GreetingClient is a client program that connects to a server by using a 
 * socket and send a greeting, and then waits for response.
 */

package com.samovich.java.advanced.networking;

import java.net.*;
import java.io.*;

public class GreetingClient {

    public static void main(String[] args) {
    
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        
        try {
            System.out.println("Connecting to " + serverName +  "on port" + port);
            
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
