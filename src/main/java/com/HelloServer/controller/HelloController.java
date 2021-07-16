package com.HelloServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView sayHello(){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("msg", "Hello my girl friend");
        return mav;
    }
    @RequestMapping("/home")
    public String homePage(ModelMap map){
        map.addAttribute("msg", "Hello my girl friend");
        return "hello";
    }
}
