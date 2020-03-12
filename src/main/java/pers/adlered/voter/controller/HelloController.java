package pers.adlered.voter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.adlered.voter.exception.UserNoExistException;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String customizeViewError(Model model) throws Exception {
       // System.out.println("自定义页面异常");
        throw new UserNoExistException(100,"自定义全局异常");        //抛出自定义异常
    }
    @RequestMapping(value = "/helloError")
    public Object index(){
        int i= 1/0;
        return " ";
    }



}
