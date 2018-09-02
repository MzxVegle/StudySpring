package com.Vegle.Advices;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 在Aspect中可以不实现任何接口，直接定义出增强方法即可
 */
@Component
@Aspect //声明当前的Bean为切面
public class UserServicesAdvice {
    @Pointcut(value = "execution(* com.Vegle.Implements.*.ad*(..))")
    private void pointcut(){}
    @Pointcut(value = "execution(* com.Vegle.Implements.*.upda*(..))")
    private void pointcut1(){}
      public UserServicesAdvice(){

    }
    //切点允许使用逻辑运算符，来拦截多个方法
    @Before("pointcut()||pointcut1()")
    public void before(){
        System.out.println("前置...");
    }


}
