package com.tight.coupling;

public class UserManager {
    // Currently working in MySQL DB
    MySQL_Database database = new MySQL_Database();
    public String getUserInformation() {
        return database.getUserDetails();
    }
}
