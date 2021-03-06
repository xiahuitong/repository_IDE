package cn.itcase.Dao;
import cn.itcase.domain.Book;
import java.sql.SQLException;


public interface BookDao {
    //根据id查询语句
    Book findid(int id) throws SQLException;
    //根据id修改price
    void findprice(int id, double price) throws SQLException;
    //根据id转帐
    Book findbyid(int id) throws SQLException;
    //更新数据库
    void update(Book book) throws SQLException;
}
