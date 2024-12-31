package com.tight.coupling;

public class App {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        String info = manager.getUserInformation();

        System.out.println(info);
    }
}