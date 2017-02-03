/**
 * @file JSONEncodeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 *
 * Following example makes use of JSONObject and JSONArray where JSONObject is 
 * java.util.Map and JSONArray is a java.util.List, so it's possible to access 
 * them with standard operations of Map or List.
 */

package org.samovich.technologies.specialized.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDecodeDemo {

    public static void main(String[] args) throws ParseException {

        JSONParser parser = new JSONParser();
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";

        try {
            Object obj = parser.parse(s);
            JSONArray array = (JSONArray)obj;
            System.out.println("The 2nd element of array");
            System.out.println(array.get(1));
            System.out.println();

            JSONObject obj2 = (JSONObject)array.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj2.get("1"));

            s = "{}";
            obj = parser.parse(s);
            System.out.println(obj);

            s= "[5,]";
            obj = parser.parse(s);
            System.out.println(obj);

            s= "[5,,2]";
            obj = parser.parse(s);
            System.out.println(obj);
        } catch(ParseException pe) {
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }

    }
    
}
