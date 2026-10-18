import java.sql.*;
public class sql {
    public static void main(String[] args){
        try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/application",
                    "root",
                    "root"
            );
            System.out.println("Connected Successfully");
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
