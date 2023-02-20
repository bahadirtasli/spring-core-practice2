package org.example.beans;

import lombok.Value;
import org.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */
@Component(value ="firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName() {
        this.name = "Bahadir";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
