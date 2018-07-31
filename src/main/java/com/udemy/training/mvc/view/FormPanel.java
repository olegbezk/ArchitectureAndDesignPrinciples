package com.udemy.training.mvc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JTextField nameField;

    private JTextField occupationField;

    private JButton okButton;

    private FormListener formListener;

    public FormPanel() {
        initializeClass();
        setClassDimensions();
        setupLayout();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (this.formListener != null) {
            String personName = this.nameField.getText();
            String personOccupation = this.occupationField.getText();
            this.formListener.okButtonClicked(personName, personOccupation);
        }
    }

    private void setupLayout() {
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridy = 0;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.3;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Name: "), gc);

        gc.gridx++;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        // new row

        gc.gridy++;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.4;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Occupation: "), gc);

        gc.gridx++;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);

        // new row

        gc.gridy++;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 10;
        gc.fill = GridBagConstraints.NONE;

        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(okButton, gc);
    }

    private void setClassDimensions() {
        Dimension dim = getPreferredSize();
        dim.width = 300;
        setPreferredSize(dim);
        setMinimumSize(dim);
    }

    private void initializeClass() {
        this.nameField = new JTextField(10);
        this.occupationField = new JTextField(10);
        this.okButton = new JButton("OK");
        this.okButton.addActionListener(this);
    }

    public void setFormListener(final FormListener formListener) {
        this.formListener = formListener;
    }
}
