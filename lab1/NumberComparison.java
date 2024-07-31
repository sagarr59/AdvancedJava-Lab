package lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberComparison {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Comparison");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Components
        JLabel lbl1 = new JLabel("Enter first number:");
        JTextField txt1 = new JTextField();

        JLabel lbl2 = new JLabel("Enter second number:");
        JTextField txt2 = new JTextField();

        JButton btnCompare = new JButton("Compare");
        JLabel lblResult = new JLabel("Result:");

        // Adding components to frame
        frame.add(lbl1);
        frame.add(txt1);
        frame.add(lbl2);
        frame.add(txt2);
        frame.add(btnCompare);
        frame.add(lblResult);

        btnCompare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());

                    if (num1 > num2) {
                        lblResult.setText("Result: " + num1 + " is greater");
                    } else if (num2 > num1) {
                        lblResult.setText("Result: " + num2 + " is greater");
                    } else {
                        lblResult.setText("Result: Both numbers are equal");
                    }
                } catch (NumberFormatException ex) {
                    lblResult.setText("Invalid input, please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}
