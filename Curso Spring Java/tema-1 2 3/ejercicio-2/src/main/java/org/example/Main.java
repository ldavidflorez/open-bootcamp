package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService user = (UserService) context.getBean("userService");
        user.saludar();

        UserService user1 = (UserService) context.getBean("userService");
        user1.saludar();
    }
}
