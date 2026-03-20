public class Login {
    static String username = "admin";
    static String password = "123456";

    public static boolean checkUser() {
        return username.equals("admin");
    }

    public static void main(String[] args) {
        System.out.println(checkUser());
    }
}
