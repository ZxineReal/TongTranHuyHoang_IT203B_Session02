package baitap.bai3;

public interface Authenticatable {
    String getPassword();

    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().trim().isEmpty();
    }

    static String encrypt(String rawPassword) {
        return "ENC_" + rawPassword;
    }
}
