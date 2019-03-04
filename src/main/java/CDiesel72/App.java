package CDiesel72;

import java.sql.SQLException;
import java.util.Scanner;

public class App {

    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/bdorders?serverTimezone=Europe/Kiev";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "14041707";

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        ConnectionFactory.inic(DB_CONNECTION, DB_USER, DB_PASSWORD);
        try {
            ClientDAO clDAO = ConnectionFactory.getClDAO();
            ProductDAO prDAO = ConnectionFactory.getPrDAO();
            OrderDAO orDAO = ConnectionFactory.getOrDAO();
            Menu menu = new Menu();

            while (true) {
                menu.bdToScreen(clDAO, prDAO, orDAO);
                System.out.println("1: Добавить клиента");
                System.out.println("2: Добавить товар");
                System.out.println("3: Оформить заказ");
                System.out.print("-> ");

                String s = sc.nextLine();
                System.out.println("------");
                switch (s) {
                    case "1":
                        clDAO.add(menu.newClient());
                        break;
                    case "2":
                        prDAO.add(menu.newProduct());
                        break;
                    case "3":
                        orDAO.add(menu.newOrder());
                        break;
                    default:
                        return;
                }
            }
        } finally {
            ConnectionFactory.getConn().close();
        }
    }
}
