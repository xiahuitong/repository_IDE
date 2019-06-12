package cn.itcase.controller;


import cn.itcase.domin.Items;
import cn.itcase.service.ItemsSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/items")
public class itemscontroller {
@Autowired
    private ItemsSerice itemsSerice;
@RequestMapping("/find")
    public String find(Model model){
    Items byid = itemsSerice.findByid(1);
    model.addAttribute("item",byid);
    return "itemDetail";

}

}
