public class Users {
    private String name;
    private String password;

    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return name + " -> " + password;
    }
}
