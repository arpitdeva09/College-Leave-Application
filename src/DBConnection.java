import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection()
            throws SQLException {

        String url =
                "jdbc:mysql://localhost:3306/application"; // Your SQL file URl

        String username = "YOUR_USERNAME"; // Your SQLWorkbench username
        String password = "YOUR_PASSWORD"; // Your SQLWorkbench password

        return DriverManager.getConnection(
                url, username, password
        );
    }
}
