package org.example.beans;

import lombok.Setter;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */

@Setter
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }
}