package com.Vegle.Services;

import com.Vegle.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional(transactionManager="dataSourceTransactionManager")
public class AccountServicesImpl implements AccountServices{
    @Autowired
    private IAccountDao iAccountDao;
    public void account(String inname, String outname, int money) {

        System.out.println("转帐前"+iAccountDao.select());
        iAccountDao.inmoney(inname,money);
        //在不添加事务的情况下出现异常会导致一方扣费成功一方没有扣费的情况
        //System.out.println(2/0);
        iAccountDao.outmoney(outname,money);
        System.out.println("转帐后"+iAccountDao.select());

    }
}
