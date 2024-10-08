package lab2;

import javax.swing.*;

public class ImageInJFrame extends JFrame {

    public ImageInJFrame() {

        setTitle("Image in JFrame ");

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("src\\lab2\\logo.jpg");

        JLabel label = new JLabel(imageIcon);

        add(label);

        setIconImage(imageIcon.getImage());
        //to show
        setVisible(true);
    }

    public static void main(String[] args) {

        new ImageInJFrame();
    }
}
