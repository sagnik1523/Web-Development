package com.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mongodb")
public class MongoDB implements Database {
    @Value("Connected to MongoDB")
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
