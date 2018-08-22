package com.Vegle.Test;

import com.Vegle.Beans.Car;
import com.Vegle.Beans.CollectionInject;
import com.Vegle.Beans.People;
import com.Vegle.Beans.TestBean01;
import com.Vegle.Utils.SpringUtil;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
public class Test {

    ApplicationContext ctx;
    @Before
    public void init(){
        SpringUtil springUtil = new SpringUtil();
        ctx = springUtil.generateApplicationContext();
    }
    @org.junit.Test
    public void test01(){
        TestBean01 testBean01 =(TestBean01)ctx.getBean("testBean01");
        System.out.println(testBean01);
    }
    @org.junit.Test
    public void test02(){
        //  利用类型返回IOC容器中的Bean，但是要求Bean在IOC中是唯一的
        TestBean01 testBean01 =  ctx.getBean(TestBean01.class);
        System.out.println(testBean01.toString());
    }
    @org.junit.Test
    public void test03(){

        Car car = (Car) ctx.getBean("testBean02");
        System.out.println(car.toString());
    }
    @org.junit.Test
    public void test04(){
        People people = (People) ctx.getBean("people");
        People people1 = (People) ctx.getBean("people");
        System.out.println(people == people1);
    }
    @org.junit.Test
    public void test05(){
        CollectionInject inject = (CollectionInject) ctx.getBean("collectionInject");
        System.out.println(inject.getList());
        System.out.println(inject.getSet());
        System.out.println(inject.getMap());
        System.out.println(inject.getProperties()
        );
    }
    @org.junit.Test
    public void test06(){
        //使用p名称空间
        People people = (People) ctx.getBean("people2");
        System.out.println(people.toString());
        //使用c名称空间
        Car car = (Car) ctx.getBean("car4");
        System.out.println(car);
    }
    @org.junit.Test
    public void test07(){
        //spel表达式
        People people = (People) ctx.getBean("people3");
        System.out.println(people);
    }

}
