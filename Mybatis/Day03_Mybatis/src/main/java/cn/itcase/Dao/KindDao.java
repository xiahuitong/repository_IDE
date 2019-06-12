package cn.itcase.Dao;

import cn.itcase.domain.Book;
import cn.itcase.domain.Kind;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KindDao {
//    @Select("select * from kind where kid=#{kid}")
//    Kind findcase1(int id);


    @Select("select * from kind")
    @Results({
            @Result(many = @Many(select = "cn.itcase.Dao.BookDao.findcase7"),column = "kid",property = "books")
    })
        List<Kind> findcase8();


    @Select("select * from kind")
    @Results({
            @Result(many = @Many(select = "cn.itcase.Dao.BookDao.findcase8"),property = "books",column = "kid")
    })
    List<Kind> findcase9();
}
