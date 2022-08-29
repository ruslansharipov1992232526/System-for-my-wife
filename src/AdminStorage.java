import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private String password;

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void login(String name, String password) {
        name = "Mariya";
        password = "123";
        List<String> storageDateAdmin = new ArrayList<>();
        storageDateAdmin.add(name);
        storageDateAdmin.add(password);
        System.out.println(storageDateAdmin);
    }
}
