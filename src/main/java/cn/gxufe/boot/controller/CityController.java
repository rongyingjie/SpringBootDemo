package cn.gxufe.boot.controller;

import cn.gxufe.boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 燕赤侠 2016-10-16
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/city")
public class CityController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("hello","====hello====");
        model.addAttribute("citys",customerService.getCitys());

        return "index";
    }

}
