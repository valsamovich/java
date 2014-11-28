/**
 * @file IPAddress.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * This program prints IP or internet protocol address computer system.
 * InetAddress class of java.net package is used, getLocalHost method returns
 * InetAddress object which represents localhost.
 */

package com.valerysamovich.java.programs;

import java.net.InetAddress;

public class IPAddress {

    public static void main(String[] args) throws Exception {

        System.out.println(InetAddress.getLocalHost());
    }
}
