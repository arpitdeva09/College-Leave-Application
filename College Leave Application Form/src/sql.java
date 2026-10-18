import java.sql.*;
public class sql {
    public static void main(String[] args){
        try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/application",
                    "your_username", // username of your MySQL workbench
                    "your_password" // password of your MySQL workbench
            );
            System.out.println("Connected Successfully");
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
