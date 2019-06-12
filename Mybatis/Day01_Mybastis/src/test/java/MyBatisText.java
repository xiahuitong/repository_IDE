import cn.itcase.Dao.BookDao;
import cn.itcase.domain.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisText {
    //查询数据的测试类
    private InputStream stream;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private BookDao bookdao;

    /**
     * 配置文件
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

    /**
     * 添加数据
     */
    @Test
    public void sava() {
        //添加数据
        Book book = new Book();
        book.setAuthor("张三");
        book.setBookname("李四");
        book.setCompany("哈哈哈");
        book.setKind_id(12);
        book.setPrice(12.5);
        bookdao.sava(book);
    }

    /**
     * 查询数据
     */
    @Test
    public void findAll(){
        List<Book> all = bookdao.findAll();
        for (Book book:all){
           System.out.println(book);
       }
    }
    /**
     * 修改数据
     */
    @Test
    public void userupdate(){
        //修改数据
       Book book=new Book();
       book.setId(4);
       book.setBookname("巴黎圣母院");
       book.setAuthor("路遥");
       book.setCompany("人民大学出版社");
       book.setPrice(49.9);
       book.setKind_id(2);
       bookdao.userupdate(book);
    }


    /**
     * 删除数据
     */
    @Test
    public void userdelete(){
        //删除数据
        bookdao.userdelete(3);
    }
    /**
     * 一次查询一条语句
     */
    @Test
    public void find(){
        //查询
        Book book = bookdao.find(1);
        System.out.println(book);
    }
    /**
     * 模糊查询
     */
    @Test
    public void finddim() {
        //模糊查询
        List<Book> finddim = bookdao.finddim("%%");
        for (Book book : finddim) {
            System.out.println(book);
        }
    }
    /**
     * 查询总记录数
     */
    @Test
    public void sumrecord(){
        int sumrecord = bookdao.sumrecord();
        System.out.println(sumrecord);
    }

    /**
     * 查询页数条数Book方法
     */
    @Test
    public void bookvo(){
        Book bookvo = bookdao.bookvo();
        System.out.println("总条数"+bookvo.getTotal());
        System.out.println("总页数"+bookvo.getPages());
    }

    /**
     * 查询总页数总条数Map方法
     */
    @Test
    public void bookMap(){
        Map<String, Object> map = bookdao.bookMap();
        System.out.println(map.get("total"));
        System.out.println(map.get("pages"));
    }
    /**
     * 获取插入的id
     */
   @Test
    public void getid(){
       BookDao bookdao = session.getMapper(BookDao.class);
       Book book=new Book();
        book.setBookname("巴黎圣母院");
        book.setAuthor("路遥");
        book.setCompany("人民大学出版社");
        book.setPrice(49.9);
        book.setKind_id(2);
        bookdao.getid(book);
       System.out.println(book.getId());
    }

/**
 * List集合查询多条语句
 */
@Test
public void findcase2(){
    List<String> list=new ArrayList<>();
    list.add("西游记");
    list.add("水浒传");
    List<Book> books = bookdao.findcase2(list);
    for (Book book : books) {
        System.out.println(book);
    }

}

    /**
     * Map集合查询多条语句
     */
    @Test
    public void   findcase3(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","中国人民大学出版社");
        map.put("id",1);
        List<Book> books = bookdao.findcase3(map);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * 数组查询多条集合
     */
    @Test
public void findcase4(){
        BookDao mapper = session.getMapper(BookDao.class);
        String[] str={"中国人民大学出版社","广东人民出版社"};
        List<Book> books = mapper.findcase4(str);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * 释放资源
     * @throws
     */
    @After
    public void after() throws Exception {
        //释放资源
        session.close();
        stream.close();
    }



















}

