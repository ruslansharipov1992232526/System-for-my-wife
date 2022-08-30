import java.util.*;

public class Admin extends Users {
    public Admin(String name, String password) {
        super(name, password);
    }
    public static Map<String, Users> storageDateAdmin = new HashMap();
    public static void login(String name, String password) {
        storageDateAdmin.put("Admin", new Users(name, password));
    }
    public static void addAdmin() {
        Admin.login("Ruslan", "123");
//        for (Map.Entry<String, Users> entry : Admin.storageDateAdmin.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
    }
    public static void loginAdmin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Веедите имя");
            String inputName = scanner.nextLine();
            System.out.println("Введите пароль");
            String inputPassword = scanner.nextLine();
            if (inputName.equals("Ruslan") && inputPassword.equals("123")) {
                System.out.println("Здравствуйте, Руслан");
            } else {
                System.out.println("Вы не администратор, доступ запрещен");
            }
            return;
        }
    }
}
