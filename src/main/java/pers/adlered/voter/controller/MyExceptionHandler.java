package pers.adlered.voter.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pers.adlered.voter.exception.UserNoExistException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object  handleException(Exception e){
         Map<String ,Object> map=new HashMap<>();
         map.put("code","400");
         map.put("message",e.getMessage());
        // map.put("url", request.getRequestURL());
       // Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        // request.setAttribute("javax.servlet.error.status_code",500);
        // request.setAttribute("ext",map);
        //转发到/error
      //  request.getRequestDispatcher("/error").forward(request,response);
        //return "forward:/error";
        return map;
    }


    @ExceptionHandler(UserNoExistException.class)
    public ModelAndView runtimeExceptionHandler(HttpServletRequest request,UserNoExistException ex){
        System.out.println("全局的异常处理器");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("forward:/error");
        modelAndView.addObject("code", ex.getCode());
        modelAndView.addObject("msg", ex.getMsg());
       // request.getAttributeNames();
        return modelAndView;

    }

}
