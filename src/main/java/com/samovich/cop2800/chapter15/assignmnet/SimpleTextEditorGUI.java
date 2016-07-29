package com.samovich.cop2800.chapter15.assignmnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Contain the code for the interface and event handling
 * Filename SimpleTextEditorGUI
 * Created by Valery Samovich
 * Written on 7/27/16
 */
public class SimpleTextEditorGUI  extends JFrame implements ActionListener {
    private JMenuBar mnuBar;
    private JMenu mnuFile;
    private JMenu mnuHelp;
    private JMenuItem mnuOpen;
    private JMenuItem mnuSave;
    private JMenuItem mnuExit;
    private JMenuItem mnuAbout;
    JTextArea jtxt;

    /**
     * Constructor
     */
    public SimpleTextEditorGUI(String title) {
        super(title);
        setSize(360, 210);
        initializeGUI();
    }

    /**
     * InitializeGUI for Simple Text Editor
     */
    private void initializeGUI() {
        // initialize menu components
        mnuBar = new JMenuBar();
        mnuFile = new JMenu("File");
        mnuHelp = new JMenu("Exit");
        mnuOpen = new JMenuItem("Open");
        mnuSave = new JMenuItem("Save ...");
        mnuExit = new JMenuItem("Exit");
        mnuAbout = new JMenuItem("About");
        // add constants from keyboard
        mnuFile.setMnemonic(KeyEvent.VK_F);
        mnuHelp.setMnemonic(KeyEvent.VK_H);
        mnuOpen.setMnemonic(KeyEvent.VK_O);
        mnuSave.setMnemonic(KeyEvent.VK_S);
        mnuExit.setMnemonic(KeyEvent.VK_E);
        mnuAbout.setMnemonic(KeyEvent.VK_A);
        mnuBar.add(mnuFile);
        mnuBar.add(mnuHelp);
        mnuFile.add(mnuOpen);
        mnuFile.add(mnuSave);
        mnuFile.addSeparator();
        mnuFile.add(mnuExit);
        mnuHelp.add(mnuAbout);
        // initialize submenu components
        setJMenuBar(mnuBar);
        jtxt = new JTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: implement actions
    }
}
