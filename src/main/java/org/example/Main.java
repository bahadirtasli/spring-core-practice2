package org.example;

import org.example.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("John");
        System.out.println(myBean.sayHello());
    }
}