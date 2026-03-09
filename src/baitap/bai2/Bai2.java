package baitap.bai2;

public class Bai2 {
    public static void main(String[] args) {

        IPasswordValidator validator = password -> password.length() >= 8;

        System.out.println(validator.isValid("12345678"));
        System.out.println(validator.isValid("1234"));
    }
}

