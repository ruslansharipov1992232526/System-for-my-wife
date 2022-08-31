import java.util.Objects;

public class UsersBuy {

    private String name;
    private String phone;
    private String productName;
    private String price;

    public UsersBuy(String name, String phone, String productName, String price) {
        this.name = name;
        this.phone = phone;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(UsersBuy.class)) return false;
        UsersBuy userB = (UsersBuy) obj;
        return phone.equals(userB.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    public String toString() {
        return name + " -> " + phone + " -> "  + productName + "->" + price;
    }
}
