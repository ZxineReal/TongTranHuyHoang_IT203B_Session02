package baitap.bai6;

public class Bai6 {
    public static void main(String[] args) {
        UserProcessor processor = UserUtils::convertToUpperCase;

        User user = new User("anime");

        String result = processor.process(user);

        System.out.println(result);
    }
}
