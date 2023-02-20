package org.example.beans;

import lombok.Setter;
import org.example.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */
@Setter
@Component
public class MyBean {
private BeanName name;

public MyBean(@Qualifier("firstName")BeanName name) {
    this.name = name;
    }

    public String sayHello() {
        return "Hello!" + name.getName();
    }
}