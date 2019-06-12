package cn.itcase.Dao;

import cn.itcase.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {
    //查询全部信息
   @Select("select * from book")
    List<Book> findcase1();
    //模糊查询
   @Select("select * from book where company like #{company}")
    List<Book> findcase2(Book book);
    //按条件查询
    @Select("select * from book where id=#{id}")
    List<Book> findcase3(Integer id);
    //按区间查询
    @Select("select * from book where price>=#{a} and price<=#{b}")
    List<Book> findcase4(@Param("a") double a,@Param("b") double b);
    //数据封装
    @Select("select b.bookname,k.kname,k.kid from book b,kind k where b.kind_id=k.kid")
    @Results({
            @Result(property = "k.kname",column = "kname"),
            @Result(property = "k.kid",column = "kid")
    })
    List<Book> findcase5();

//    //多表查询
//    @Select("select b.bookname,b.kind_id from book b")
//    @Results({
//            @Result(property = "k",column = "kind_id", one = @One(select = "cn.itcase.dao.KindDao.findcase1"))
//            })
//            List< Book > findcase6();

    @Select("select * from book where kind_id=#{id}")
    List<Book> findcase7(int id);


    @Select("select * from book where kind_id=#{id}")
    List<Book> findcase8(int id);



    //查询数据
 @Select(" select b.*,k.kname from book b,kind k where b.kind_id=k.kid")
 @Results({
         @Result(property = "k.kname",column = "kname")
 })
   List<Book> findcase6();





}
