package com.Vegle.Factorys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
public class ProxyFactory implements InvocationHandler {
    private Object target;  //目标对象

    public ProxyFactory(Object target) {
        //构造器获取目标对象
        this.target = target;
    }

    public Object createProxy(){
        //  1、获取目标对象的ClassLoader
        ClassLoader classLoader = target.getClass().getClassLoader();
        //  2、获取目标对象的接口集interfaces(因为一个接口可能有多个实现)
        Class[] interfaces = target.getClass().getInterfaces();
        //  3、第三个参数为InvocationHandler，是一个接口，这个Class中实现了InvocationHandler的方法invoke
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, this);
        return proxy;
    }
/**
 * @param proxy 生成的代理对象，一般不使用
 * @param method 目标对象的行为方法
 * @param args  行为方法的参数，当参数为空时，agrs = null
 * */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("时间:"+format.format(System.currentTimeMillis()));
        //  返回执行target目标对象的方法
        return method.invoke(target,args);
    }
}
