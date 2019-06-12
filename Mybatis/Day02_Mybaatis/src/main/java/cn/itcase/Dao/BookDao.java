package cn.itcase.Dao;
import cn.itcase.domain.Book;
import java.util.List;

public interface BookDao {
    List<Book> findbycase(Book book);

    List<Book> findbycase1(String bookname);

    List<Book> findbycase2(List<Integer> list);
    //一对一多表查询
    List<Book> findcase1();


}
