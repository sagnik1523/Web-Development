package com.loose.coupling;

public class UserManager {
    final private DatabaseManager database;
    public UserManager(DatabaseManager database) {
        this.database = database;
    }

    public String getUserInformation() {
        return database.getUserDetails();
    }
}
