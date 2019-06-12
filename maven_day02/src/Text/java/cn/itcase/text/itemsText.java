package cn.itcase.text;
import cn.itcase.Dao.itemsDao;
import cn.itcase.service.ItemsSerice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class itemsText {
    @Test
     public void findByid(){
      ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
//        dao测试
        ItemsSerice service = ac.getBean("itemsServiceimpl", ItemsSerice.class);

        System.out.println( service.findByid(1).getName());

//        service测试
       // System.out.println(ac.getBean(ItemsSerice.class).findByid(1).getName());




    }



}
