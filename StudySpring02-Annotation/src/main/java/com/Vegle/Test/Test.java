package com.Vegle.Test;

import com.Vegle.Bean.User;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext ctx;
    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @org.junit.Test
    public void test01(){
        System.out.println(ctx.getBean("car"));
        User user =(User)ctx.getBean("user");
        System.out.println(user);
    }
}
