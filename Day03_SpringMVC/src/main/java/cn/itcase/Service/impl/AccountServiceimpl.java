package cn.itcase.Service.impl;

import cn.itcase.Dao.AccountDao;
import cn.itcase.Service.AccountService;
import cn.itcase.dimain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceimpl implements AccountService {
    @Autowired
private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("这是findAll方法");
        return accountDao.findAll();
    }

    @Override
    public void add(Account account) {
        System.out.println("这是add方法");
        accountDao.add(account);
        int a=1/0;
    }
}
