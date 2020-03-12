package pers.adlered.voter.component;


import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String lang = httpServletRequest.getParameter("lang");
        Locale locale = Locale.getDefault();
        if(!StringUtils.isEmpty(lang)){
            String[] parts = lang.split("_");
            locale = new Locale(parts[0],parts[1]);
        }else{
          String servletPath=  httpServletRequest.getServletPath();
          if (servletPath.lastIndexOf("cn")>0) {
              locale = new Locale("zh","CN");
          }else if (servletPath.lastIndexOf("en")>0){
              locale = new Locale("en","US");
          }
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}