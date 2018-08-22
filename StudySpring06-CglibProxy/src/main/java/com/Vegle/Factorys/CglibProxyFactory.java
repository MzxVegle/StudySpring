package com.Vegle.Factorys;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

public class CglibProxyFactory implements MethodInterceptor {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object createProxy(){
        //  1、创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //  2、传递目标对象的Class文件
        enhancer.setSuperclass(target.getClass());
        //  3、设置回调操作(相当于InvocationHandler)
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //  相当于InvocationHandler中的invoke方法
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(System.currentTimeMillis()));
        return method.invoke(target,args);
    }
}
