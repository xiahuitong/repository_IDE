package cn.itcase.Dao.impl;
import cn.itcase.Dao.BookDao;
import org.springframework.stereotype.Repository;
import java.awt.print.Book;
import java.util.List;

//载入容器
@Repository
public class BookDaoimpl implements BookDao {
    @Override
    public List<Book> findcase() {
        System.out.println("ABC");
        return null;
    }
}
