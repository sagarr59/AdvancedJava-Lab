package lab4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator {
    public static void main(String[] args) {
        SumBean bean = new SumBean();
        JFrame frame = new JFrame("Sum Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new java.awt.FlowLayout());

        JTextField textField1 = new JTextField(10);
        JLabel sum = new JLabel("+");
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Sum: ");

        frame.add(textField1);
        frame.add(sum);
        frame.add(textField2);
        frame.add(button);
        frame.add(resultLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    bean.setNumber1(num1);
                    bean.setNumber2(num2);
                    resultLabel.setText("Sum: " + bean.getSum());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        frame.setVisible(true);
    }
}
