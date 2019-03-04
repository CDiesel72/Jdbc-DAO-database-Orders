package CDiesel72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Bios on 29.11.2017.
 */
public class ConnectionFactory {

    private ConnectionFactory() {
    }

    private static Connection conn;
    private static ClientDAO clDAO;
    private static ProductDAO prDAO;
    private static OrderDAO orDAO;

    public static void inic(String url, String login, String password) {
        try {
            conn = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        clDAO = new ClientDAO(conn, "clients");
        prDAO = new ProductDAO(conn, "products");
        orDAO = new OrderDAO(conn, "orders");
    }

    public static Connection getConn() {
        return conn;
    }

    public static ClientDAO getClDAO() {
        return clDAO;
    }

    public static ProductDAO getPrDAO() {
        return prDAO;
    }

    public static OrderDAO getOrDAO() {
        return orDAO;
    }
}
