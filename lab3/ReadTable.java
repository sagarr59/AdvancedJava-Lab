package lab3;

import java.sql.*;

class ReadTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/lab3db";
        String query = "SELECT * FROM info";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery(query);

            // Process and display results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
