package baitap.bai5;

class SuperAdmin implements UserActions, AdminActions {

    @Override
    public void logActivity(String activity) {
        System.out.println("SuperAdmin logging:");

        UserActions.super.logActivity(activity);
        AdminActions.super.logActivity(activity);
    }

}
