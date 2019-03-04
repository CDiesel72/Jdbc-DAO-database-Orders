package CDiesel72;

/**
 * Created by Diesel on 03.03.2019.
 */
public class Order {

    @Id
    private int id;
    private int idClient;
    private int idProduct;

    public Order() {
    }

    public Order(int idClient, int idProduct) {
        this.id = 0;
        this.idClient = idClient;
        this.idProduct = idProduct;
    }

    public int getId() {
        return id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        Client cl = ConnectionFactory.getClDAO().getObj(Client.class, idClient);
        Product pr = ConnectionFactory.getPrDAO().getObj(Product.class, idProduct);

        return "Order{" +
                "id=" + id +
                ", " + cl +
                ", " + pr +
                '}';
    }
}
