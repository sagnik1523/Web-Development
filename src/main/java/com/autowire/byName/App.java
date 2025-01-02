package com.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("byNameConfig.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
