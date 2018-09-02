package com.Vegle.Test;

import com.Vegle.InterFaces.UserServices;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    private UserServices userServices;
    @Before
    public void init(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        userServices = (UserServices) ctx.getBean("userServicesImpl");
    }
    @org.junit.Test
    public void test01(){
        userServices.add();
        userServices.update();
    }
}
