import cn.itcase.Dao.BookDao;
import cn.itcase.Dao.KindDao;
import cn.itcase.domain.Book;
import cn.itcase.domain.Kind;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatis {
    private InputStream stream;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;


    /**
     * 配置文件
     *
     * @throws IOException
     */
    @Before
    public void before() throws Exception {
        //读取配置文件
        stream = Resources.getResourceAsStream("SqlConMaofigin.xml");
        //
        builder = new SqlSessionFactoryBuilder();
        //使用工厂生产Sqlsession对象

        factory = builder.build(stream);
        //
        session = factory.openSession(true);//不用手动提交
    }
//    查询全部信息
  @Test
  public void findcase1(){
      BookDao mapper = session.getMapper(BookDao.class);
      List<Book> books = mapper.findcase1();
      for (Book book : books) {
          System.out.println(book);
      }
  }
//    模糊查询
@Test
public void findcase2(){
        Book book=new Book();
        book.setCompany("%文艺%");
    BookDao mapper = session.getMapper(BookDao.class);
    List<Book> books = mapper.findcase2(book);
    for (Book book1 : books) {
        System.out.println(book1);
    }

}
//    按条件查询
@Test
public void findcase3(){
    List<Book> books = session.getMapper(BookDao.class).findcase3(12);
    for (Book book : books) {
        System.out.println(book);
    }


}
    //按区间查询
@Test
public void findcase4(){
    List<Book> books = session.getMapper(BookDao.class).findcase4(30, 50);
    for (Book book : books) {
        System.out.println(book);
    }

}
    //数据封装
    @Test
    public void findcase5(){
        BookDao mapper = session.getMapper(BookDao.class);
        List<Book> books = mapper.findcase5();
        for (Book book : books) {
            System.out.println(book.getBookname());
            System.out.println(book.getK().getKname());
            System.out.println(book.getK().getKid());
        }
    }
    @Test
    public  void findcase6(){
        BookDao mapper = session.getMapper(BookDao.class);
        List<Book> books = mapper.findcase6();
        for (Book book : books) {
            System.out.println(book);
            System.out.println(book.getK().getKname());
        }
    }

    //多表查询
//    @Test
//    public void findcase6(){
//        BookDao mapper = session.getMapper(BookDao.class);
//        List<Book> books = mapper.findcase6();
//        for (Book book : books) {
//            System.out.println(book.getBookname());
//            System.out.println(book.getK().getKname());
//            System.out.println(book.getK().getKid());
//        }
//    }

    @Test
    public void  findcase8(){
        KindDao mapper = session.getMapper(KindDao.class);
        List<Kind> list = mapper.findcase8();
        for (Kind kind : list) {
            System.out.println(kind.getKname());
            for (Book book : kind.getBooks()) {
                System.out.println(book.getBookname());
            }
        }
    }


    @Test
    public void findcase9(){
        KindDao mapper = session.getMapper(KindDao.class);
        List<Kind> list = mapper.findcase9();
        for (Kind kind : list) {
            System.out.println(kind.getKname());
            for (Book book : kind.getBooks()) {
                System.out.println(book.getCompany());
            }
        }
    }

    /**
     * 释放资源
     *
     * @throws
     */
    @After
    public void after() throws IOException {
        //释放资源
        session.close();
        stream.close();
    }
}

