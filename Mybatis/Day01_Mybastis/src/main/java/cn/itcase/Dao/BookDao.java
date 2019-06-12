package cn.itcase.Dao;

import cn.itcase.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {
    //查询方法
    List<Book> findAll();

    //添加方法
    void  sava(Book book);

    //修改方法
    void userupdate(Book book);

    //删除方法
    void userdelete(Integer id);

    //查询一条语句的方法
    Book find(Integer id);

    //通过bookname进行模糊查询
    List<Book> finddim(String name);

    //查询总记录数
    int sumrecord();

    //查询总页数 ,总条数,list方法
    Book bookvo();

    //查询总页数,总条数Map方法
    Map<String,Object> bookMap();

    //List查询多条语句的方法
    List<Book> findcase2(List<String> list);

    //Map查询多条语句
    List<Book> findcase3(Map<String,Object> map);

    //通过数组查询多条语句
    List<Book> findcase4(String[] str);

    //获取插入的id
    void getid(Book book);
}
