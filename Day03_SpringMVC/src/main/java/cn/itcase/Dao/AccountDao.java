package cn.itcase.Dao;

import cn.itcase.dimain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有账户
     */
    @Select("select * from account")
    public List<Account> findAll();


    /**
     * 保存账户
     */
    @Select("insert into account(name,money) values(#{name},#{money})")
    public int add(Account account);


}
