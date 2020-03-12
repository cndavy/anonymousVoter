package pers.adlered.voter.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import pers.adlered.voter.exception.UserNoExistException;
import pers.adlered.voter.service.UserMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginHandleIntercepter implements HandlerInterceptor {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("request请求地址path[{}] uri[{}]", request.getServletPath(),request.getRequestURI());
        //request.getHeader(String) 从请求头中获取数据
        //从请求头中获取用户token（登陆凭证根据业务而定）
        Long userId= getUserId(request.getHeader("H-User-Token"));
      //  if (userId != null && checkAuth(userId,request.getRequestURI()))
        {
            return true;
        }
        //这里的异常是我自定义的异常，系统抛出异常后框架捕获异常然后转为统一的格式返回给前端， 其实这里也可以返回false
       // throw new UserNoExistException("No access");

    }

    private boolean checkAuth(Long userId, String requestURI) {
        return true;
    }

    private Long getUserId(String header) {
         return  1L;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
