package com.udemy.training.mvc.view;

import com.udemy.training.mvc.constants.Constants;
import com.udemy.training.mvc.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements FormListener {

    private static final long serialVersionUID = 1L;

    private FormPanel formPanel;

    private TextPanel textPanel;

    private Controller controller;

    public MainFrame() {
        super(Constants.APPLICATION_TITLE);

        initializeClass();
        setLayout();
    }

    @Override
    public void okButtonClicked(final String personName, final String personOccupation) {
        this.controller.addPerson(personName, personOccupation);
        this.controller.refreshScreen();
    }

    public void refreshTextArea(String name, String occupation) {
        this.textPanel.addText(name + " - " + occupation);
    }

    public void clearText() {
        this.textPanel.clearText();
    }

    private void setLayout() {
        add(this.formPanel, BorderLayout.WEST);
        add(this.textPanel, BorderLayout.CENTER);

        setSize(700, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeClass() {
        this.controller = new Controller(this);
        this.formPanel = new FormPanel();
        this.formPanel.setFormListener(this);
        this.textPanel = new TextPanel();
    }
}
