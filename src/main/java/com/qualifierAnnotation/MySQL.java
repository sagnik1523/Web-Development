package com.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mysql")
public class MySQL implements Database {
    @Value("Connected to MySQL")
    private String connectionMessage;

    public void setConnectionMessage(String connectionMessage) {
        this.connectionMessage = connectionMessage;
    }

    public String getConnectionMessage() {
        return connectionMessage;
    }

    @Override
    public String connectToDatabase() {
        return getConnectionMessage();
    }
}
