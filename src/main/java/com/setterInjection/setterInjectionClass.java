package com.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterInjectionClass {
    public static void main(String[] args) {
        // Fetch the spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjectionConfig.xml");
        // Fetch the bean out of the container
        Car car = (Car) context.getBean("car");
        // Display the object fetched
        System.out.println(car);
    }
}