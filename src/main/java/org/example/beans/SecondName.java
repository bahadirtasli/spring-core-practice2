package org.example.beans;

import org.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */
@Component(value ="SecondName")
public class SecondName implements BeanName {
    private String name;

    public SecondName() {
        this.name = "Tasli";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
