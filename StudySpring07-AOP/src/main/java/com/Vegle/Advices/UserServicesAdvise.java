package com.Vegle.Advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserServicesAdvise implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知");
    }

    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("环绕通知前");
        Object value = mi.proceed();
        System.out.println("环绕通知后");
        return value;
    }
}
