package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // So spring container injected the dependency i.e. object of MySQL_Connector
        MySQL_Connector connector = (MySQL_Connector) context.getBean("mysql");
        connector.connectToDatabase();
    }
}
