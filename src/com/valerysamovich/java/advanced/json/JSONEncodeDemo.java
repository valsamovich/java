/**
 * @file JSONEncodeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 * 
 * Following example to encode JSON Object using Java JSONObject with is 
 * subclass of java.util.HashMap.
 */

package com.valerysamovich.java.advanced.json;

import org.json.simple.JSONObject;

public class JSONEncodeDemo {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        
        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));
        
        System.out.print(obj);
    }
}
