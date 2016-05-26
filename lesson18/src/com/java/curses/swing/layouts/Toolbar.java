package com.java.curses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel{

    private JButton buttonHallo = new JButton("Hallo");
    private JButton buttonGoodbye = new JButton("Goodbye");

    public Toolbar() {


        LayoutManager flowLayout = new FlowLayout();

        setLayout(flowLayout);

        add(buttonHallo, flowLayout);
        add(buttonGoodbye, flowLayout);

        buttonHallo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hallo!");
            }
        });

        buttonGoodbye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
            }
        });


    }
}
