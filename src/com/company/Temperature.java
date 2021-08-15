package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JPanel {
    private JLabel inputPanel;
    private JLabel outputPanel;
    private JLabel resultPanel;
    private JTextField fahrenheit;

    public Temperature() {
        inputPanel = new JLabel("Fahrenheit temperature: ");
        outputPanel = new JLabel("Temperature in celsius: ");
        resultPanel = new JLabel("---");

        fahrenheit = new JTextField(5);
        fahrenheit.addActionListener(new TemperatureConverter());

        add(inputPanel);
        add(fahrenheit);
        add(outputPanel);
        add(resultPanel);

        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.yellow);
    }

    public class TemperatureConverter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int fahrenheitTemp;
            int celsiusTemp;

            String text = fahrenheit.getText();
            fahrenheitTemp = Integer.parseInt(text);

            celsiusTemp = (fahrenheitTemp - 32) * 5/9;

            resultPanel.setText(Integer.toString(celsiusTemp));
        }
    }
}
