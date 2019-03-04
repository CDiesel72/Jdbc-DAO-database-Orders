package CDiesel72;

import java.util.Scanner;

/**
 * Created by Diesel on 03.03.2019.
 */
public class Menu {
    private Scanner sc = new Scanner(System.in);

    private String scNotEmpty() {
        String st = null;
        while ((st == null) || (st.isEmpty())) {
            st = sc.nextLine();
        }
        return st;
    }

    public Client newClient() {
        System.out.println("Введите данные клиента:");
        System.out.print("имя клиента: ");
        String name = scNotEmpty();
        System.out.print("телефон: ");
        int phone = sc.nextInt();
        System.out.println("------");
        return new Client(name, phone);
    }

    public Product newProduct() {
        System.out.println("Введите данные товара:");
        System.out.print("тип товара: ");
        String type = scNotEmpty();
        System.out.print("модель товара: ");
        String model = scNotEmpty();
        System.out.println("------");
        return new Product(type, model);
    }

    public Order newOrder() {
        System.out.println("Введите данные заказа:");
        System.out.print("ID клиента: ");
        int idClient = sc.nextInt();
        System.out.print("ID товара: ");
        int idProduct = sc.nextInt();
        System.out.println("------");
        return new Order(idClient, idProduct);
    }

    public void bdToScreen(ClientDAO cl, ProductDAO pr, OrderDAO or) {
        System.out.println("КЛИЕНТЫ:");
        cl.getAll(Client.class);
        System.out.println("ТОВАРЫ:");
        pr.getAll(Product.class);
        System.out.println("ЗАКАЗЫ:");
        or.getAll(Order.class);
    }
}
