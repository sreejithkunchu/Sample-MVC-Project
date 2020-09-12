package com.mvcModel.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField nameField;
    private JTextField ageField;
    private JButton okButton;
    private FormListener formListener;

    public FormPanel(){
        initializeClass();
        setClassDimension();
        setLayout();
    }

    private void setLayout(){
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridy = 0;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.3;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Name: "),gc);
        gc.gridx++;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField,gc);


        gc.gridy++;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.4;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Age: "),gc);
        gc.gridx++;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(ageField,gc);

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1;
        gc.weighty = 10;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(okButton,gc);

    }

    public void setFormListener(FormListener formListener){
        this.formListener = formListener;
    }

    private  void setClassDimension(){
        Dimension dim = getPreferredSize();
        dim.width = 300;
        setPreferredSize(dim);
        setMinimumSize(dim);
    }

    private void initializeClass(){
        this.nameField = new JTextField(10);
        this.ageField = new JTextField(3);
        this.okButton = new JButton("OK");
        this.okButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.formListener != null){
                String personName = this.nameField.getText();
                int age = Integer.parseInt(this.ageField.getText());
                this.formListener.okButtonClicked(personName,age);
        }
    }
}
