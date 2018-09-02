import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    /**
     * 传统的使用JDBCTemplate的方法
     */
    public void test01(){
        // 1、需要创建一个数据库连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 2、对dataSource的相关设置(驱动，username，password)
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///springtest");
        dataSource.setUsername("root");
        dataSource.setPassword("mzzxttao");
        // 3、创建一个jdbctemplate来对数据库进行操作
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        List list = template.queryForList("select * from t_user");
        System.out.println(list);
    }

    /**
     * Spring中配置数据库连接池的方式
     * 可以省略相当一大把的代码量
     */
    @Test
    public void test02(){
        List list = jdbcTemplate.queryForList("select * from t_user");
        System.out.println(list);
    }
}
