package org.example.configuration;

import org.example.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bahadir Tasli
 * @Date 2/20/2023
 */

@Configuration
public class ApplicationConfiguration {

    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName("Bahadir");
        return myBean;
    }

}
