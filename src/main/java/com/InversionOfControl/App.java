package com.InversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Get IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("inversionOfControl.xml");
        // Can directly get the user manager bean as constructor injection makes sure dependency is available
        UserManager userManagerMongoDB = (UserManager) context.getBean("userManagerMongoDB");
        System.out.println(userManagerMongoDB.getConnection());

        UserManager userManagerMySQL = (UserManager) context.getBean("userManagerMySQL");
        System.out.println(userManagerMySQL.getConnection());
    }
}
