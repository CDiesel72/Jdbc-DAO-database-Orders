package CDiesel72;

import java.sql.Connection;

/**
 * Created by Bios on 29.11.2017.
 */
public class OrderDAO extends AbstractDAO<Integer, Order> {
    public OrderDAO(Connection conn, String table) {
        super(conn, table);
    }
}
