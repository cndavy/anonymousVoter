package pers.adlered.voter.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Component(value = "defaultErrorAttributes")
public class MyErrorAttributers extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map= super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("ext","ext");
        map.put("msg", "出错了！出错了！"); // 添加一个自定义的错误信息
        //map.remove("error"); // 移除一个默认的错误信息
       // map.remove("trace");
        map.put("pmap",webRequest.getParameterMap());

       return  map;
    }


}
