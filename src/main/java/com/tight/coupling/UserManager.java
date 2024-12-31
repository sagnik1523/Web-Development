package com.tight.coupling;

public class UserManager {
    // Currently working in MySQL DB
    MySQL_Database database = new MySQL_Database();

    // Now want to change to Mongo DB
    MongoDB_Database newDatabase = new MongoDB_Database();
    public String getUserInformation() {
        // return database.getUserDetails();
        // need to change this line also for MongoDB

        return newDatabase.getUserDetails();
    }
}
