package lab1;

import javax.swing.*;
import java.awt.*;

public class SumOfSquares {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum of Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3, 2));

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ");

        calculateButton.addActionListener(e -> {
            try {
                double value1 = Double.parseDouble(textField1.getText());
                double value2 = Double.parseDouble(textField2.getText());
                resultLabel.setText("Result: " + (value1 * value1 + value2 * value2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entered invalid numbers");
            }
        });

        frame.add(new JLabel("Enter first number:"));
        frame.add(textField1);
        frame.add(new JLabel("Enter second number:"));
        frame.add(textField2);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
/*
JLabel label = new JLabel("Enter first number:");
frame.add(label);

 */