package com.InversionOfControl;

public class MySQLDatabase implements Database {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String establishConnection() {
        return getMessage();
    }
}