package lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialOnMouseEntered {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Factorial");
        JLabel resultLabel = new JLabel("Result");

        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    long factorial = calculateFactorial(number);
                    resultLabel.setText("Factorial of " + number + " is " + factorial);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer");
                }
            }
        });

        frame.add(new JLabel("Enter a number:"));
        frame.add(textField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Enter +ve number only");
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
