public class UsersBuy {
    private String name;
    private String productName;
    private long price;

    public UsersBuy(String name, String productName, long price) {
        this.name = name;
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return name + " -> " + productName + "->" + price;
    }
}
