package cn.itcase.Service.impl;

import cn.itcase.Dao.BookDao;
import cn.itcase.Dao.impl.BookDaoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

@Component //用于对象生成
public class BookServiceimpl implements cn.itcase.Service.BookService {
   //自动到bean.xml中寻找实现类
   @Autowired
   //@Qualifier("bookDaoimpl")
    BookDao dao;
    @Override
    public List<Book> findcase() {
        return dao.findcase();
    }
}
