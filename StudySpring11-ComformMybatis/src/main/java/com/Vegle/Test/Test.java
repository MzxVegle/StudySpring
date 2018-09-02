package com.Vegle.Test;

import com.Vegle.Dao.CurdDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
    @Autowired
    CurdDao curdDao;
    @org.junit.Test
    public void test01(){
        curdDao.getuser();
    }
}
