public class Login {
    static String username = "admin";
    static String password = "123456";

    public static boolean checkUser() {

        return username.equals("admin");
        return password.length() > 5;

    }

    public static void main(String[] args) {
        System.out.println(checkUser());
    }
}
