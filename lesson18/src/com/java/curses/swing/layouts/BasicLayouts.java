package com.java.curses.swing.layouts;

import javax.swing.*;

public class BasicLayouts {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm();
//                new GridForm();
            }
        });
    }
}
