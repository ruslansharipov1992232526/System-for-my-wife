import java.util.*;

public class Admin extends Users {
    public Admin(String name, String password) {
        super(name, password);
    }
    public static Map<String, Users> storageDateAdmin = new HashMap();

    public static Scanner scanner = new Scanner(System.in);
    public static void login(String name, String password) {
        storageDateAdmin.put("Admin", new Users(name, password));
    }
    public static void addAdmin() {
        Admin.login("Ruslan", "123");
    }
    public static void loginAdmin() {

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

    public static void views() {
        System.out.println("Добро пожаловать в админ панель!");
        Map<String, UsersBuy> infoBuyUsers = new HashMap<>();
        while (true) {
            String[] action = {
                    "1. Посмотреть кто купил на самую большую сумму",
                    "2. Добавить покупателя, покупку и сумму покупки в базу",
                    "3. Удалить покупателя из базы",
                    "4. Закрыть программу"
            };
            for (String actions : action) {
                System.out.println(actions);
            }

            System.out.println("Вывберите действие");
            String inputAction = scanner.nextLine();

            switch (inputAction) {
                case "1":
                    String addInfoUsersName = scanner.nextLine();
                    String addInfoUsersProduct = scanner.nextLine();
                    String addInfoUsersProductPrice = scanner.nextLine();
                    infoBuyUsers.put("UsersInfo", new UsersBuy(addInfoUsersName, addInfoUsersProduct, Integer.parseInt(addInfoUsersProductPrice)));
                    for (Map.Entry<String, UsersBuy> e  :  infoBuyUsers.entrySet()) {
                        System.out.println(e.getKey() + " " + e.getValue());
                    }
                    break;
                case "2":
                    System.out.println("2");
                default:
                    System.out.println("no");
                break;
            }
        }
    }
}
