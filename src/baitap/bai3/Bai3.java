package baitap.bai3;

public class Bai3 {
    public static void main(String[] args) {
        User user = new User("123456");

        System.out.println("Authenticated: " + user.isAuthenticated());

        String encrypted = Authenticatable.encrypt("123456");
        System.out.println("Encrypted password: " + encrypted);
    }
}
