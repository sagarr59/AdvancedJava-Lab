package lab2;

import javax.swing.*;
import java.awt.*;

public class FontColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font and Color");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Creating a label and changing its font and color
        JLabel label = new JLabel("Hello, Swing!");
        label.setFont(new Font("Arial", Font.BOLD, 40)); // Change font
        label.setForeground(Color.BLUE); // Change font color

        // Creating a button and changing its font and color
        JButton button = new JButton("Click Me");
        button.setFont(new Font("Serif", Font.ITALIC, 35)); // Change font
        button.setForeground(Color.RED); // Change font color
        button.setBackground(Color.YELLOW); // Change background color


        panel.add(label);
        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);
    }
}
