package lab3;

import java.sql.*;

class UpdateTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/lab3db";
        String updateSQL = "UPDATE info SET address = 'Kalanki' WHERE name = 'Sagar'";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute update
            int rowsAffected = st.executeUpdate(updateSQL);
            if (rowsAffected > 0) {
                System.out.println("Update successful.");
            } else {
                System.out.println("No records updated.");
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
