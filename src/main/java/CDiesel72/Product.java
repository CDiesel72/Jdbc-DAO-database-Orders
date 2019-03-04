package CDiesel72;

/**
 * Created by Diesel on 03.03.2019.
 */
public class Product {

    @Id
    private int id;
    private String type;
    private String model;

    public Product() {
    }

    public Product(String type, String model) {
        this.id = 0;
        this.type = type;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
