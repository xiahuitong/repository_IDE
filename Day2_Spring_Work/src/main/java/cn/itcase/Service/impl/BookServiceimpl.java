package cn.itcase.Service.impl;
import cn.itcase.Dao.BookDao;
import cn.itcase.Service.BookService;
import cn.itcase.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class BookServiceimpl implements BookService {
   @Autowired
    BookDao dao;
   @Autowired
    Connection conn;

    @Override
    public Book findid(int id) throws SQLException {
        return dao.findid(2);
    }

    @Override
    public void findprice(int id, double price) throws SQLException {
         dao.findprice(id,price);
    }

    /**
     * 通过id转
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Book findbyid(int id) throws SQLException {
        return dao.findbyid(id);
    }

    /**
     * 更新数据库
     * @param book
     * @throws SQLException
     */

    @Override
    public void update(Book book) throws SQLException {
           dao.update(book);
    }
}
