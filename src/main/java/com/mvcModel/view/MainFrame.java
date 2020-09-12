package com.mvcModel.view;

import com.mvcModel.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements FormListener {

    private static final long serialVersionUID = 1L;
    private FormPanel formPanel;
    private TextPanel textPanel;
    private Controller controller;

    public MainFrame() {
        super("MVC");
        initializeClass();
        setLayout();
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


    @Override
    public void okButtonClicked(String personName, int age) {
        this.controller.addPerson(personName, age);
        this.controller.refreshScreen();
    }

    public void refreshTextArea(String name, int age) {
        this.textPanel.addText(name + "  " + age);
    }

    public void clearText() {
        this.textPanel.clearText();
    }
}
