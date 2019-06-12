package cn.itcase.Service;

import cn.itcase.dimain.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户
    public List<Account> findAll();
    //保存账户
    public void add(Account account);
}
