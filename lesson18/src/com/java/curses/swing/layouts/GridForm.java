package com.java.curses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridForm extends JPanel{

    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button31;
    private JButton button32;
    private JButton button33;

    public GridForm() {

        Dimension dimension = new Dimension();
        dimension.width = 100;
        dimension.height = 100;

        button11 = new JButton("Button 11");
        button12 = new JButton("Button 12");
        button13 = new JButton("Button 13");
        button21 = new JButton("Button 21");
        button22 = new JButton("Button 22");
        button23 = new JButton("Button 23");
        button31 = new JButton("Button 31");
        button32 = new JButton("Button 32");
        button33 = new JButton("Button 33");

        button11.setPreferredSize(dimension.getSize());
        button12.setPreferredSize(dimension.getSize());
        button13.setPreferredSize(dimension.getSize());
        button21.setPreferredSize(dimension.getSize());
        button22.setPreferredSize(dimension.getSize());
        button23.setPreferredSize(dimension.getSize());
        button31.setPreferredSize(dimension.getSize());
        button32.setPreferredSize(dimension.getSize());
        button33.setPreferredSize(dimension.getSize());


        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(button11, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        add(button12, gc);

        gc.gridx = 2;
        gc.gridy = 0;
        add(button13, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(button21, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(button22, gc);

        gc.gridx = 2;
        gc.gridy = 1;
        add(button23, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(button31, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        add(button32, gc);

        gc.gridx = 2;
        gc.gridy = 2;
        add(button33, gc);

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button11.setText("X");
            }
        });

    }
}
