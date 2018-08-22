package com.Vegle.Test;

import com.Vegle.Factorys.CglibProxyFactory;
import com.Vegle.InterFaces.Services;
import com.Vegle.InterFacesImpls.ServicesImpl;

public class Test {
    @org.junit.Test
    public void test01(){
        //  1、new一个新的对象
        Services services = new ServicesImpl();
        //  2、新建一个cglib工厂，将services对象交给工厂
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(services);
        //  3、通过工厂创建出一个增强后的代理类(cglib中可以为没有实现接口的类做代理，也可以为实现接口的类做代理)
        // Services proxy = (Services) cglibProxyFactory.createProxy();
        ServicesImpl proxy = (ServicesImpl) cglibProxyFactory.createProxy();
        //  4、执行方法
        proxy.login();
        proxy.reg("Vegle");
    }
}
