package com.Vegle.Implements;

import com.Vegle.InterFaces.UserServices;
import org.springframework.stereotype.Service;

@Service("userServicesImpl")
public class UserServicesImpl implements UserServices {
    public void add() {
        System.out.println("***增加用户***");
    }

    public void update() {
        System.out.println("***更新用户***");
    }
}
