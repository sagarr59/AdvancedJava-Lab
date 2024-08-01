package lab3;

import java.sql.*;

public class InsertStudentDetails {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/StudentDB";
        String sql = "INSERT INTO Student (id, name, age) VALUES "
                + "(1, 'Sagar Raut', 22), "
                + "(2, 'Sujal Raut', 18), "
                + "(3, 'Cusal KC ', 21)";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute update (insert records)
            st.executeUpdate(sql);
            System.out.println("Records inserted successfully.");

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
