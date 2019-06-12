package cn.itcase.Dao.impl;
import cn.itcase.Dao.BookDao;
import cn.itcase.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;


@Repository
public class BookDaoimpl implements BookDao {
    @Autowired
    QueryRunner runner;
    @Override
    public Book findid(int id) throws SQLException {

        String sql = "select * from book where id=?";
        return runner.query(sql,new BeanHandler<>(Book.class),id);
    }

    @Override
    public void findprice(int id, double price) throws SQLException {
        String sql="update book set price=? where id=?";
         runner.update(sql,price,id);
    }

    /**
     * 通过id转账
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Book findbyid(int id)throws SQLException {
        String str = "select * from book where id=?";
        return runner.query(str, new BeanHandler<>(Book.class), id);
    }

    /**
     * 更新数据库
     * @param book
     * @throws SQLException
     */

    @Override
    public void update(Book book)throws SQLException {
        String sql = "update book set price=? where id=?";
        runner.update(sql,book.getPrice(),book.getId());
    }


}

