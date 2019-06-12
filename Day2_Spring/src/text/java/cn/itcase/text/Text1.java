package cn.itcase.text;

import cn.itcase.Service.BookService;
import cn.itcase.Service.impl.BookServiceimpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.List;

public class Text1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("bean.xml");
        BookService service = cs.getBean("bookServiceimpl", BookServiceimpl.class);
        service.findcase();
    }
}

