package lab1;

import javax.swing.*;
import java.awt.event.*;

public class KeyAndWindowListener {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Key and Window Listener");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextArea
        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        // Add a KeyListener to the JTextArea
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        // Add a WindowListener to the JFrame
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        });

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
