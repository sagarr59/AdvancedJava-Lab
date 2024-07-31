package lab1;

import javax.swing.*;
import java.awt.*;

public class LayoutManagers extends JFrame {

    public LayoutManagers() {
        setTitle("Layout Managers ");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2)); // Arranging four panels in 2x2 grid

        // Panel with FlowLayout
        JPanel flow = new JPanel(new FlowLayout());
        flow.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        flow.add(new JButton("Button 1"));
        flow.add(new JButton("Button 2"));
        flow.add(new JButton("Button 3"));

        // Panel with BorderLayout
        JPanel border = new JPanel(new BorderLayout());
        border.setBorder(BorderFactory.createTitledBorder("BorderLayout"));
        border.add(new JButton("North"), BorderLayout.NORTH);
        border.add(new JButton("South"), BorderLayout.SOUTH);
        border.add(new JButton("East"), BorderLayout.EAST);
        border.add(new JButton("West"), BorderLayout.WEST);
        border.add(new JButton("Center"), BorderLayout.CENTER);

        // Panel with GridLayout
        JPanel grid = new JPanel(new GridLayout(2, 2));
        grid.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        grid.add(new JButton("Button 1"));
        grid.add(new JButton("Button 2"));
        grid.add(new JButton("Button 3"));
        grid.add(new JButton("Button 4"));

        // Panel with BoxLayout
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
        box.setBorder(BorderFactory.createTitledBorder("BoxLayout"));
        box.add(new JButton("Button 1"));
        box.add(new JButton("Button 2"));
        box.add(new JButton("Button 3"));

        // Add panels to the main frame
        add(flow);
        add(border);
        add(grid);
        add(box);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutManagers();
    }
}
