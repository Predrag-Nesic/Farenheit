package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel panel = new Temperature();

	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
    }
}
