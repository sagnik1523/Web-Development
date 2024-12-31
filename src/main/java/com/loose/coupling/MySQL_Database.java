package com.loose.coupling;

public class MySQL_Database implements DatabaseManager{

    @Override
    public String getUserDetails() {
        return "Dummy MySQL statement";
    }
}
