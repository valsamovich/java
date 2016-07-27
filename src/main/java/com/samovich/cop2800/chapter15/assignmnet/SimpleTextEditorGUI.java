package com.samovich.cop2800.chapter15.assignmnet;

import javax.swing.*;
import java.awt.*;

/**
 * Contain the code for the interface and event handling
 * Filename SimpleTextEditorGUI
 * Created by Valery Samovich
 * Written on 7/27/16
 */
public class SimpleTextEditorGUI  extends JFrame {
    private JMenuBar mnuBar = new JMenuBar();
    private JMenu mnuFile = new JMenu("Edit");
    private JMenu mnuHelp = new JMenu("Help");

    public SimpleTextEditorGUI() {
        setLayout(new BorderLayout());
        setSize(360, 210);
        setJMenuBar(mnuBar);
        mnuBar.add(mnuFile);
        mnuBar.add(mnuHelp);
    }
}
