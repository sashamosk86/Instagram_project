package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Sasha on 04.10.2017.
 */
public class DBConnection {
    private static final String DB_DRIVER = "org.sqlite.JDBC";
    private static final String DB_URL = "jdbc:sqlite:G:/ITEA/DB/database.db";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL);
            System.out.println("connection OK!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("connection ERROR!");
        }
        return connection;
    }
}
