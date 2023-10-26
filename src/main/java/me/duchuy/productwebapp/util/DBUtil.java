package me.duchuy.productwebapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DBUtil {
    
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                String connectionDB = "jdbc:postgresql://dpg-cksd9l10at9c73choq10-a/test_deploy_db";
                String driverName = "org.postgresql.Driver";
                String username = "test_deploy_db_user";
                String password = "MXOyJJ5M3Q0yIRDNY6XhUaPaaRFYZtph";
                Class.forName(driverName);
                conn = DriverManager.getConnection(connectionDB, username, password);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
