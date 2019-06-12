package cn.itcase.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("findAll方法");
        return "SpringMVC";
    }

    @RequestMapping("/add")
    public String add(){
        System.out.println("这是add方法");
        return "redirect:/account/findAll";
    }



}
