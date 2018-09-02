package com.Vegle.Implements;

import com.Vegle.InterFaces.UserServices;

public class UserServicesImpl implements UserServices {
    public String add() {
        System.out.println("***增加用户***");
        int i = 2/0;
        return "Hello Spring***";
    }

}
