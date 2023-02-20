package org.example;

import org.example.beans.MyBean;
import org.example.beans.SecondName;
import org.example.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.sayHello());

        myBean.setName(new SecondName());
        System.out.println(myBean.sayHello());

    }
}