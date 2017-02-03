package org.samovich.cop2800.chapter15.assignmnet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Contain the code for the interface and event handling
 * Filename SimpleTextEditorGUI.java
 * Created by Valery Samovich
 * Written on 7/27/16
 */
public class SimpleTextEditorGUI  extends JFrame implements ActionListener, ItemListener {
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
    private JScrollPane scrollPane = new JScrollPane(textArea,
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
        addListeners();
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
        // add components to subpanel
        subPanel.setLayout(new GridLayout(7, 1));
        subPanel.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 4));
        subPanel.add(lblFontSize);
        subPanel.add(cboFontSize);
        subPanel.add(lblFont);
        subPanel.add(cboFont);
        subPanel.add(chkBold);
        subPanel.add(chkItalic);
        subPanel.add(chkUnderline);
        // add components to main panel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(subPanel, BorderLayout.EAST);
        mainPanel.add(lblStatus, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    /**
     * Add the listeners for each component that can be source of event
     */
    private void addListeners() {
        mnuOpen.addActionListener(this);
        mnuSave.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuAbout.addActionListener(this);
        chkBold.addItemListener(this);
        chkItalic.addItemListener(this);
        chkUnderline.addItemListener(this);
        cboFontSize.addItemListener(this);
        cboFont.addItemListener(this);
    }

    /**
     * Method design to perform action based on event(s) for submenu components
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // logic for open menu
        if(event.getSource() == mnuOpen) {
            lblStatus.setText("The Open option on the menu was selected");
        }
        // logic for open menu
        if(event.getSource() == mnuSave) {
            lblStatus.setText("The Save option on the menu was selected");
        }
        // logic for exit menu
        if(event.getSource() == mnuExit) {
            System.exit(0);
        }
        // display info about text editor
        if(event.getSource() == mnuAbout) {
            JOptionPane.showMessageDialog(null,
                    "Simple Text Editor\nVersion: 1.0\nAuthor: Valery Samovich",
                    "About",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Method design to perform action based on state for comboboxes and checkboxes
     * @param event
     */
    @Override
    public void itemStateChanged(ItemEvent event){
        // logic for font size
        if(event.getSource() == cboFontSize) {
            if (cboFontSize.getSelectedItem().equals(cboFontSize.getSelectedItem())) {
                lblStatus.setText("The font size was changed to " +
                        cboFontSize.getSelectedItem());
            }
        }
        // logic for font size
        if(event.getSource() == cboFont) {
            if (cboFont.getSelectedItem().equals(cboFont.getSelectedItem())) {
                lblStatus.setText("The font style was changed to " +
                        cboFont.getSelectedItem());
            }
        }
        // logic for bold text
        if(event.getSource() == chkBold) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                lblStatus.setText("Bold was added");
            } else {
                lblStatus.setText("Bold was removed");
            }
        }
        // logic for italic text
        if(event.getSource() == chkItalic) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                lblStatus.setText("Italic was added");
            } else {
                lblStatus.setText("Italic was removed");
            }
        }
        // logic for italic text
        if(event.getSource() == chkUnderline) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                lblStatus.setText("Underline was added");
            } else {
                lblStatus.setText("Underline was removed");
            }
        }
    }
}
