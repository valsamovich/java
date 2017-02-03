package org.samovich.cop2800.chapter7;

import javax.swing.*;

/**
 * Filename RepairName.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class RepairName {
    public static void main(String[] args) {
        // declare fields
        String name, saveOriginalName;
        int stringLenght;
        int i;
        char c;
        // prompt the user
        name = JOptionPane.showInputDialog(
                null,
                "Please enter your first and last name");
        saveOriginalName = name;
        stringLenght = name.length();
        for(i = 0; i < stringLenght; i++){
            c = name.charAt(i);
            if(i == 0){
                c = Character.toUpperCase(c);
                name = c + name.substring(1, stringLenght);
            }else{
                if(name.charAt(i) == ' '){
                    ++i;
                    c = name.charAt(i);
                    c = Character.toUpperCase(c);
                    name = name.substring(0, i) + c +
                            name.substring(i + 1, stringLenght);
                }
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Original name was " + saveOriginalName +
                        "\nRepaired name is " + name);
    }
}
