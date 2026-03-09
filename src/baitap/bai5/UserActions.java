package baitap.bai5;

interface UserActions {

    default void logActivity(String activity) {
        System.out.println("User activity: " + activity);
    }

}