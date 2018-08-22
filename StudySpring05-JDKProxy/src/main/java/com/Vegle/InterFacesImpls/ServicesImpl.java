package com.Vegle.InterFacesImpls;

import com.Vegle.InterFaces.Services;

public class ServicesImpl implements Services {
    public void login() {
        System.out.println("登陆启动....");
    }

    public void reg(String name) {
        System.out.println("注册:"+name);
    }
}
