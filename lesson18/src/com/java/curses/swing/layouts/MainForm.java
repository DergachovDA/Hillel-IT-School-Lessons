package com.java.curses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{

    private JTextArea textArea;
    private JButton button;

    private JTextArea textArea2;

    public MainForm() {
        super("Basic Layouts");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x = screen.width;
        int y = screen.height;
        setSize((int)Math.round(x * 0.5), (int)Math.round(y * 0.6));

        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5 ,5);
        setLayout(layoutManager);

        textArea = new JTextArea();
        textArea2 = new JTextArea();
        button = new JButton("Click Me");

        Dimension textAriaSize = textArea.getPreferredSize();
        //System.out.println(textAriaSize.width + ":" + textAriaSize.height);

        textAriaSize.width = 300;
        textAriaSize.height = 100;
        textArea.setPreferredSize(textAriaSize);
        textArea2.setPreferredSize(textAriaSize);

//        add(textArea, BorderLayout.WEST);
        add(new GridForm(), BorderLayout.WEST);
//        add(textArea2, BorderLayout.EAST);
        add(button, BorderLayout.SOUTH);

        add(new Toolbar(), BorderLayout.EAST);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea.append("Some string\n");
                textArea2.setText("");
                String str = textArea.getText();
                String out = "";
                int n = Integer.parseInt(str);
                for (int i = 1; i <= n; i++) {
                    for (int j =1; j <= i; j++) {
                        out += j + " ";
                    }
                    out += "\n";
                }

                textArea2.append(out);

                //JOptionPane.showMessageDialog(null, str);
            }
        });

    }
}
