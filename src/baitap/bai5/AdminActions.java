package baitap.bai5;

interface AdminActions {

    default void logActivity(String activity) {
        System.out.println("Admin activity: " + activity);
    }

}