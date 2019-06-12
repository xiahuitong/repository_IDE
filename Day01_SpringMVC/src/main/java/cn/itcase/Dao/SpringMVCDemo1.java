package cn.itcase.Dao;
import cn.itcase.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(path = "/user")
public class SpringMVCDemo1 {

@RequestMapping(path = "/textReque")
    public static String Demo1(){
        System.out.println("hello,SpringMVC");
//        reture作用跳转界面
        return "SpringMVC";
    }

    /**
     * 请求参数获取
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(path = "/param")
    public static String Demo2(String username,Integer password){
        System.out.println("方法执行了");
        System.out.println("用户名:"+username);
        System.out.println("密码:"+password);
        return "SpringMVC";
    }

    /**
     * javaBean对象获取
     */
    @RequestMapping(path = "/javaBean")
    public static String Demo3(User user){
        System.out.println("方法执行了");
        System.out.println(user);
        return "SpringMVC";
    }

    /**
     * 自定义类型转换
     */
    @RequestMapping(path = "/custom")
    public static String Demo4(User user){
        System.out.println(user);
        return "SpringMVC";
    }


    /**
     * 获取原生的API
     */
    @RequestMapping(path = "/API")
    public static String Demo5(HttpServletRequest request, HttpServletResponse response){
//       获取request请求
        System.out.println(request);
//        获取Session域
        HttpSession session = request.getSession();
        System.out.println(session);
//        获取response响应
        System.out.println(response);
//        获取ServletContext
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        return "SpringMVC";
    }
}
