package lab3;

import java.sql.*;
class CreateDB{
    public static void main(String[] args) {
        String name="root";
        String password="";
        String url="jdbc:mysql://localhost:3306";
        String sql="Create database lab3db";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,password);

            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Database created successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}