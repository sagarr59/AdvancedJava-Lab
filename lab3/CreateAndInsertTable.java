package lab3;

import java.sql.*;

class CreateAndInsertTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/lab3db";

        // SQL statements
        String createTableSQL = "CREATE TABLE IF NOT EXISTS info (id INT AUTO_INCREMENT, name VARCHAR(200), address VARCHAR(200), PRIMARY KEY (id))";
        String insertSQL = "INSERT INTO info (name, address) VALUES ('Sagar', 'Tinthana'), ('Sujal', 'Naikap')";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Create table
            st.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            // Insert records
            st.executeUpdate(insertSQL);
            System.out.println("Records inserted successfully.");

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
