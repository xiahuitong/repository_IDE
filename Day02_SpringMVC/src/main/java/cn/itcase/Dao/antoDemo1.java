package cn.itcase.Dao;

import cn.itcase.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping(path = "/user")
public class antoDemo1 {
    @RequestMapping(path = "/note")
    //@RequestParam注解
    public  String Demo1(@RequestParam(name = "name") String username){
        System.out.println("打印执行了");
        System.out.println(username);
        return "SpringMVC";
    }
//@RequestBody注解
    @RequestMapping(path = "/fro")
    public  String Demo2(@RequestBody String user){
        System.out.println(user);
        return "SpringMVC";
    }

//    响应返回String类型
    @RequestMapping(path = "/str")
    public  String Demo3(Model model){
        User user=new User();
        user.setUsername("张三");
        user.setPassword(123456);
        model.addAttribute("user",user);
        return "SpringMVC";
    }
//    响应返回Void类型
    @RequestMapping(path = "/none")
    public void Demo4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("响应返回void类型");
        //编写请求转发程序
        request.getRequestDispatcher("/WEB-INF/pages/SpringMVC.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        return ;
    }

//    ModelAndView类型
    @RequestMapping(path = "/ModelAndView")
    public ModelAndView Model(){
        //创建对象
        ModelAndView mv=new ModelAndView();
        System.out.println("ModelAndView方法执行了");
        User user=new User();
        user.setUsername("李四");
        user.setPassword(123456);
        //把user对象储存在mv当中
        mv.addObject("user",user);
        //跳转到哪个页面
        mv.setViewName("SpringMVC");
        return mv;
    }

    @RequestMapping(path ="/ForRed")
    public String forRed(){
        System.out.println("testForwarOrRedirect方法执行了");
        //请求的转发
        return "forward:/WEB-INF/pages/SpringMVC.jsp";
        //重定向
        //return "index.jsp";
    }
    /**
     * 模拟异步请求
     */
    @RequestMapping(path = "/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("textAjax方法执行了");
        //客户端传递时json类型数据,后台将json转换为user对象
        System.out.println(user);
        //做响应模拟查询数据库
        user.setUsername("xiahuitong");
        user.setPassword(789);
        //做响应
        return user;
    }



}
