package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxListener{
    public static void main(String[] args) {

        JFrame frame = new JFrame("ItemListener ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());


        JCheckBox checkBox = new JCheckBox("Check me!");
        JLabel label = new JLabel("Checkbox is not selected.");

        frame.add(checkBox);
        frame.add(label);

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Checkbox is selected.");
                } else {
                    label.setText("Checkbox is not selected.");
                }
            }
        });

        frame.setVisible(true);
    }
}
