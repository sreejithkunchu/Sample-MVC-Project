package com.mvcModel.view;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;

    public TextPanel(){
        initializeClass();
        setLayout();
    }

    private void setLayout(){
        setLayout(new BorderLayout());
        textArea.setFont(new Font("Tahoma", Font.PLAIN,14));
        add(new JScrollPane(textArea),BorderLayout.CENTER);
    }

    private void  initializeClass(){
        this.textArea = new JTextArea();
    }

    public void addText(String text){
        this.textArea.append(text + "\n");
    }

    public void clearText(){
        this.textArea.setText("");
    }
}
