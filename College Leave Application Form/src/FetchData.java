import java.sql.*;
public class FetchData {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root", "root");
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM form")
        ){
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " +
                                    rs.getString("student_name") + " " +
                                    rs.getInt("roll_number") + " " +
                                    rs.getString("department") + " " +
                                    rs.getString("semester") + " " +
                                    rs.getString("type_of_leave") + " " +
                                    rs.getInt("from_date") + " " +
                                    rs.getInt("end_date") + " " +
                                    rs.getString("reason"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
