import cn.itcase.Dao.BookDao;

import cn.itcase.Dao.KindDao;
import cn.itcase.Dao.customerDao;
import cn.itcase.domain.Book;
import cn.itcase.domain.Kind;
import cn.itcase.domain.customer;
import cn.itcase.domain.saleinfo;
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


public class Mybastis {
    //查询数据的测试类
    private InputStream stream;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private BookDao bookdao;

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
        bookdao = session.getMapper(BookDao.class);
    }

//    @Test
//    public void findbycase() {
//        Book book = new Book();
//        book.setBookname("三国演义");
//        List<Book> list = bookdao.findbycase(book);
//        for (Book book1 : list) {
//            System.out.println(book1);
//        }
//    }
//
//    @Test
//    public void findbycase1(){
//        List<Book> name = bookdao.findbycase1("有话说");
//        for (Book book : name) {
//            System.out.println(book);
//        }
//    }
//
//    @Test
//    public void findbycase2(){
//        List<Integer> array=new ArrayList<>();
//        array.add(1);
//        array.add(2);
//        List<Book> books = bookdao.findbycase2(array);
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }

    /**
     * 一对一多表查询
     */
    @Test
    public void findcase1(){
        BookDao mapper = session.getMapper(BookDao.class);
        List<Book> books = mapper.findcase1();
        for (Book book : books) {
            System.out.println(book.getBookname()+"==="+book.getKind().getKname());
        }
    }

    /**
     * 多对一多表查询
     */
   @Test
   public void findcase2(){
       List<Kind> list = session.getMapper(KindDao.class).findcase2();
       for (Kind kind : list) {
           System.out.println("["+kind.getKname()+"]");
           for (Book book : kind.getBooks()) {
               System.out.println(book.getBookname());
           }
       }
   }

    @Test
    public void findcase8(){
        List<customer> customers = session.getMapper(customerDao.class).findcase8();
        for (customer customer : customers) {
            System.out.println("姓名:"+"["+customer.getName()+"]");
            for (saleinfo saleinfo : customer.getSaleinfos()) {
                System.out.println("本数:"+saleinfo.getNums());
                System.out.println("总价"+saleinfo.getSumprice());
                System.out.println("单价"+saleinfo.getBook().getPrice());
                System.out.println("书名"+saleinfo.getBook().getBookname());
            }
        }

    }


    /**
     * 释放资源
     * @throws
     */
    @After
    public void after() throws IOException {
        //释放资源
        session.close();
        stream.close();
    }

}

