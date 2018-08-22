package com.Vegle.Test;

import com.Vegle.Factorys.ProxyFactory;
import com.Vegle.InterFaces.Services;
import com.Vegle.InterFacesImpls.ServicesImpl;

public class Test {
    @org.junit.Test
    public void test01(){
        Services services = new ServicesImpl();
        ProxyFactory proxyFactory = new ProxyFactory(services);
        Services proxy = (Services) proxyFactory.createProxy();
        proxy.login();
        proxy.reg("Vegle");
    }
}
