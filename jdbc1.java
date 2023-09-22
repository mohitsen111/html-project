import java.sql.*;
class jdbc1{
   public static void main(String[] args) throws Exception {
      try{
                String url = "jdbc:mysql://localhost:3306/";

                String dbName = "stud";
                String userName = "root";
                String password = "mohit13579";

                Connection con = DriverManager.getConnection(url,userName,password );

                String sql = "CREATE DATABASE" + dbName;

                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                stmt.close();
      }
        catch(Exception e) {
         e.printStackTrace();
        }

    }
}