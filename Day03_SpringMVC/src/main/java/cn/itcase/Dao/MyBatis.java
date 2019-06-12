package cn.itcase.Dao;

import cn.itcase.dimain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatis {
    @Test
    public void testFindAll() throws Exception{
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("哈哈");
        account.setMoney(100d);
        dao.add(account);
        sqlSession.commit();
       List<Account> lists = dao.findAll();
       for (Account list : lists) {
           System.out.println(list);
       }
    }

}
