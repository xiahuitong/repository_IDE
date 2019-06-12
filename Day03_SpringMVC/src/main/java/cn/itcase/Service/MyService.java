package cn.itcase.Service;

import cn.itcase.Service.impl.AccountServiceimpl;
import cn.itcase.dimain.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyService {
    private AccountService service;
    @Before
   public void textService(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("classpath:SpringMVC.xml");
        service=con.getBean(AccountServiceimpl.class);
    }
    @Test
    public void textfindall(){
        List<Account> list = service.findAll();
    }

}
