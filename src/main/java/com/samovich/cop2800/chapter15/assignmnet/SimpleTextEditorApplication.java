package com.samovich.cop2800.chapter15.assignmnet;

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
        SimpleTextEditorGUI simpleTextEditorGUI = new SimpleTextEditorGUI();
        simpleTextEditorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleTextEditorGUI.setVisible(true);
        simpleTextEditorGUI.setTitle("Simple Text Editor");
    }
}
