package com.InversionOfControl;

public class UserManager {
    private Database database;

    // Constructor (dependency injection injects database implementation)
    UserManager(Database database) {
        this.database = database;
    }

    // Setter (setter injection would inject database implementation)
    public void setDatabase(Database database) {
        this.database = database;
    }

    public String getConnection() {
        return database.establishConnection();
    }
}