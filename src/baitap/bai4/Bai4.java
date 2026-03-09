package baitap.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Bai4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("An"));
        users.add(new User("Binh"));
        users.add(new User("Cuong"));

        Function<User, String> getUsername = User::getUsername;

        Consumer<String> printer = System.out::println;

        Supplier<User> createUser = User::new;

        for (User user : users) {
            printer.accept(getUsername.apply(user));
        }

        User newUser = createUser.get();
        printer.accept(newUser.getUsername());
    }
}
