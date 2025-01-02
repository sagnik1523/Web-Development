package com.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userManager")
public class UserManager {
    @Autowired
    @Qualifier("mongodb")  // this line tells which bean to use
    private Database database;

    public String getUserInfo() {
        return "User is logged in and " + database.connectToDatabase();
    }
}
