package com.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        UserManager userManager = (UserManager) context.getBean("userManager");
        System.out.println(userManager.getUserInfo());
    }
}
