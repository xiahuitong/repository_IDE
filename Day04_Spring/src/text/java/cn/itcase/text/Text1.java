package cn.itcase.text;
import cn.itcase.Service.BookService;
import cn.itcase.Service.impl.BookServiceimpl;
import cn.itcase.domain.Book;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.Connection;
import java.sql.SQLException;


public class Text1 {
    @Autowired
    Connection conn;
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BookServiceimpl service = ac.getBean("bookServiceimpl", BookServiceimpl.class);
        Book findid = service.findid(2);
        System.out.println(findid);
        ComboPooledDataSource com = new ComboPooledDataSource();
        QueryRunner runner = new QueryRunner(com);
    }
    @Test
    public void Text1() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BookServiceimpl service = ac.getBean("bookServiceimpl", BookServiceimpl.class);
       service.findprice(2, 100);
    }
    @Test
    public void Text2() throws SQLException {
            ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
            BookServiceimpl service = (BookServiceimpl) ac.getBean("bookServiceimpl", BookService.class);
            service.trans();
    }
}
