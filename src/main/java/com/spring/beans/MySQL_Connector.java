package com.spring.beans;

// Tell spring container that store below class's object as bean
// in the configuration file
public class MySQL_Connector {
    private String message;

    public void setMessage(String message) {
        System.out.println("Setter called");
        this.message = message;
    }

    public void connectToDatabase() {
        System.out.println("Connection Established");
    }

    @Override
    public String toString() {
        return this.message;
    }
}
