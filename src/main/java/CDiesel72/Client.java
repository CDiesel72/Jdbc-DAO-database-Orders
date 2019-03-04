package CDiesel72;

/**
 * Created by Diesel on 03.03.2019.
 */
public class Client {

    @Id
    private int id;
    private String name;
    private int phone;

    public Client() {
    }

    public Client(String name, int phone) {
        this.id = 0;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
