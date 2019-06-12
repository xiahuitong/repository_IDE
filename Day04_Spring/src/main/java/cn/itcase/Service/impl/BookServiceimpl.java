package cn.itcase.Service.impl;
import cn.itcase.Dao.BookDao;
import cn.itcase.Dao.impl.BookDaoimpl;
import cn.itcase.Service.BookService;
import cn.itcase.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.beans.Transient;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class BookServiceimpl implements BookService {
   @Autowired
    BookDao dao;
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

//    事务管理器
    @Transactional
    public void trans()throws SQLException{
        //查询数据
        Book b1 = findbyid(1);
        Book b2 = findbyid(2);
        //转帐
        b1.setPrice(b1.getPrice()-10);
        b2.setPrice(b2.getPrice()+10);
        //跟新数据库
        update(b1);
        update(b2);


    }

}
