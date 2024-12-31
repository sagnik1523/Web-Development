package com.loose.coupling;

public class App {
    public static void main(String[] args) {
        DatabaseManager database1 = new MySQL_Database();
        UserManager manager1 = new UserManager(database1);

        System.out.println(manager1.getUserInformation());

        // So, we need to just change the implementation
        // Not a single line of code was changed in UserManager
        // Thus, even if database was changed no need to change
        // other components of the application.

        DatabaseManager database2 = new MongoDB_Database();
        UserManager manager2 = new UserManager(database2);

        System.out.println(manager2.getUserInformation());
    }
}
