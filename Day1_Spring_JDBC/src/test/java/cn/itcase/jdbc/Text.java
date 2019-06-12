package cn.itcase.jdbc;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Text {
    private static Map<Object,Object> map;
    private static ClassPathXmlApplicationContext ac;
    static {
        InputStream input = Text.class.getClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        try {
            properties.load(input);
            map=new HashMap<Object, Object>();
            Set<Object> set = properties.keySet();
            for (Object key : set) {
                String property = properties.getProperty(key.toString());
                Class<?> aClass = Class.forName(property);
                Object o = aClass.newInstance();
                map.put(key,o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //根据键名读取值
    public static Object getobj(String key){
        return map.get(key);
    }

    public static void main(String[] args) {
        //读取xml文件
        ac = new ClassPathXmlApplicationContext("bean.xml");
        for (int i = 0; i < 5; i++) {
            jdbcDemo1 demo = ac.getBean("demo", jdbcDemo1.class);
            System.out.println(demo);
        }
        //构造函数方法注入


        //mysql取值
    }
    @Test
    public void Text(){
        //set方法注入
        ac=new ClassPathXmlApplicationContext("bean.xml");
        jdbcDemo2 demo1 = ac.getBean("demo1", jdbcDemo2.class);
        System.out.println(demo1.getAge());
        System.out.println(demo1.getName());
    }
    @Test
    public void Text1(){
//        构造函数方法注入
        ac=new ClassPathXmlApplicationContext("bean.xml");
        jdbcDemo3 demo3 = ac.getBean("demo2", jdbcDemo3.class);
        demo3.add();
    }

    @Test
    public void text2(){
        ac=new ClassPathXmlApplicationContext("bean.xml");

    }


}
