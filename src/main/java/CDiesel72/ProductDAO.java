package CDiesel72;

import java.sql.Connection;

/**
 * Created by Bios on 29.11.2017.
 */
public class ProductDAO extends AbstractDAO<Integer, Product> {
    public ProductDAO(Connection conn, String table) {
        super(conn, table);
    }
}
