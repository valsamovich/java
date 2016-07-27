package com.samovich.cop2800.chapter15.assignmnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

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
    JPanel plnContent = new JPanel();
    JTextArea txtArea = new JTextArea(200, 100);
    JLabel lblFontSize = new JLabel("Font Size");
    JTextField txtSetSize = new JTextField();

    /**
     * Constructor
     */
    public SimpleTextEditorGUI() {
        setSize(360, 210);
        setLayout(new BorderLayout());
        setJMenuBar(mnuBar);
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        // add constants from keyboard
        mnuFile.setMnemonic(KeyEvent.VK_F);
        mnuHelp.setMnemonic(KeyEvent.VK_H);
        // add menu
        mnuBar.add(mnuFile);
        mnuBar.add(mnuHelp);
        // text area
        plnContent.setLayout(new BorderLayout());
        plnContent.add(txtArea, BorderLayout.EAST);
        plnContent.add(lblFontSize);
        plnContent.add(txtSetSize);
        setContentPane(plnContent);
    }
}
