package org.example.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */

@Setter
@Service("myBean")
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }
}