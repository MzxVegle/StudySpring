package com.Vegle.Utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
    public ApplicationContext generateApplicationContext(){
        return new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
