package lab2;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50);

        // Draw a circle
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        // Draw a triangle
        g.setColor(Color.GREEN);
        int[] xPoints = {400, 450, 350};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Shape Drawing ");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the custom JPanel to the JFrame
        ShapeDrawing panel = new ShapeDrawing();
        frame.add(panel);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
