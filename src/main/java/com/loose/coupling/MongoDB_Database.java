package com.loose.coupling;

public class MongoDB_Database implements DatabaseManager{

    @Override
    public String getUserDetails() {
        return "Dummy MongoDB statement";
    }
}
