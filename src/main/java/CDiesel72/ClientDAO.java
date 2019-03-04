package CDiesel72;

import java.sql.Connection;

/**
 * Created by Bios on 29.11.2017.
 */
public class ClientDAO extends AbstractDAO<Integer, Client> {
    public ClientDAO(Connection conn, String table) {
        super(conn, table);
    }
}
