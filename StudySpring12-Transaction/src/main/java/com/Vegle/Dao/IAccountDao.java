package com.Vegle.Dao;

import com.Vegle.Beans.Users;

import java.util.List;

public interface IAccountDao {
    void inmoney(String name,int money);
    void outmoney(String name,int money);
    List<Users> select();
}
