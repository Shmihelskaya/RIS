import java.io.Serializable;
import java.util.List;

public class Operator implements Serializable {
    private String name;
    private List<Tarif> tarifList;
    private static int countClient = 0;

    public Operator() {
        countClient++;
    }

    public Operator(String name) {
        this.name = name;
        countClient++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountClient() {
        return countClient;
    }

    public void setCountClient(int countClient) {
        this.countClient = countClient;
    }

    public void printListClient() {
        System.out.println("Кол-во: " + countClient);
    }
}
