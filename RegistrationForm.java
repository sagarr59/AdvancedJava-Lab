import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Creating new frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Creating labels
        JLabel firstname = new JLabel("First Name:");
        firstname.setBounds(20, 20, 100, 25);
        frame.add(firstname);

        JLabel lastname = new JLabel("Last Name:");
        lastname.setBounds(20, 60, 100, 25);
        frame.add(lastname);

        JLabel email = new JLabel("Email:");
        email.setBounds(20, 100, 100, 25);
        frame.add(email);

        JLabel password = new JLabel("Password:");
        password.setBounds(20, 140, 100, 25);
        frame.add(password);

        // Creating text fields
        JTextField t1 = new JTextField();
        t1.setBounds(130, 20, 200, 25);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(130, 60, 200, 25);
        frame.add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(130, 100, 200, 25);
        frame.add(t3);

        JPasswordField t4 = new JPasswordField();
        t4.setBounds(130, 140, 200, 25);
        frame.add(t4);

        // Creating submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(130, 180, 200, 25);
        frame.add(submit);

        // Setting frame visibility
        frame.setVisible(true);

        //ActionListner need to be added for handling action events
    }
}
