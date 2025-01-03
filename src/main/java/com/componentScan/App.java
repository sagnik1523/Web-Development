package com.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager);
    }
}
