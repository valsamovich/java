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
    // initialize menu components
    private JMenuBar mnuBar = new JMenuBar();
    private final JMenu mnuFile = new JMenu("File");
    private final JMenu mnuHelp = new JMenu("File");
    private final JMenuItem mnuOpen = new JMenuItem("Open");
    private final JMenuItem mnuSave = new JMenuItem("Save ...");
    private final JMenuItem mnuExit = new JMenuItem("Exit");
    private final JMenuItem mnuAbout = new JMenuItem("About");
    private JPanel mainPanel = new JPanel();
    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane = new JScrollPane(
            textArea,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    private JPanel subPanel = new JPanel();
    private final JLabel lblFontSize = new JLabel("Font Size:");
    private final String[] INT_FONT_SIZE = {"8", "9", "10", "11", "12", "13",
            "14" ,"15", "16", "17"};
    private JComboBox<String> cboFontSize = new JComboBox<String>(INT_FONT_SIZE);
    private final JLabel lblFont = new JLabel("Font:");
    private final String[] STR_FONT = {"Ariel", "Calibri", "Consolas",
            "Courier", "System", "Tahoma"};
    private JComboBox<String> cboFont = new JComboBox<String>(STR_FONT);
    private final JCheckBox chkBold = new JCheckBox("Bold");
    private final JCheckBox chkItalic = new JCheckBox("Italic");
    private final JCheckBox chkUnderline = new JCheckBox("Underline");
    private final JLabel lblStatus = new JLabel("Status information will appear here");
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
        // add menu and submenu components
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
        setJMenuBar(mnuBar);

        // add edit components to subpanel
        subPanel.setLayout(new GridLayout(7, 1));
        subPanel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 4));
        subPanel.add(lblFontSize);
        subPanel.add(cboFontSize);
        subPanel.add(lblFont);
        subPanel.add(cboFont);
        subPanel.add(chkBold);
        subPanel.add(chkItalic);
        subPanel.add(chkUnderline);

        // add labels and fields components
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(subPanel, BorderLayout.EAST);
        mainPanel.add(lblStatus, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: implement actions
    }
}
