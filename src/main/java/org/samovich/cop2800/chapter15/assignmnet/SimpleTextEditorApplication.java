package org.samovich.cop2800.chapter15.assignmnet;

import javax.swing.*;

/**
 * Contain main method, simple graphical interface and event handling
 * Filename SimpleTextEditorApplication.java
 * Created by Valery Samovich
 * Written on 7/27/16
 */
public class SimpleTextEditorApplication {
    public static void main(String[] args) {
        // instantiate an object
        SimpleTextEditorGUI app = new SimpleTextEditorGUI("Simple Text Editor");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
