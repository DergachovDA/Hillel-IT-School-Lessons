package com.java.curses.swing.minimal;

import javax.swing.*;

public class MinimalApplication {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minimal Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
