package lab3;

import java.sql.*;

class DeleteFromTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/lab3db";
        String deleteSQL = "DELETE FROM info WHERE name = 'Sujal'";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute delete
            int rowsAffected = st.executeUpdate(deleteSQL);
            if (rowsAffected > 0) {
                System.out.println("Delete successful.");
            } else {
                System.out.println("No records deleted.");
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
