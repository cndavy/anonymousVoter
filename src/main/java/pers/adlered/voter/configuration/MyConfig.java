package pers.adlered.voter.configuration;


import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import pers.adlered.voter.component.MyLocaleResolver;
import pers.adlered.voter.filter.MyFilter;
import pers.adlered.voter.interceptor.LoginHandleIntercepter;
import pers.adlered.voter.listener.MyListener;
import pers.adlered.voter.servlet.myServlet;

import java.util.Arrays;

@Configuration
public class MyConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean( new myServlet(),"/myServlet");
        return registrationBean;
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/myServlet"));
        return registrationBean;
    }
    @Bean
    public ServletListenerRegistrationBean myServletLister(){
        ServletListenerRegistrationBean registrationBean=new ServletListenerRegistrationBean(new MyListener());
        registrationBean.setOrder(1);
        return  registrationBean;

    }
    @Bean
    public WebMvcConfigurerAdapter webMvcAutoConfigurationAdapter(){
        WebMvcConfigurerAdapter adapter= new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/index").setViewName("/index.html");
                registry.addViewController("/error/500").setViewName("/error/500");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandleIntercepter())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/login","/","/index.html");

                LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
                localeInterceptor.setParamName("lang");
                registry.addInterceptor(localeInterceptor);
            }
        };
        return adapter;
    }
   @Bean
    public LocaleResolver localeResolver(){
        return  new MyLocaleResolver();
   }
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
               // factory.setPort(8081);
//                ErrorPage error401Page= new ErrorPage(HttpStatus.UNAUTHORIZED,"/error/401");
//                ErrorPage error404Page= new ErrorPage(HttpStatus.NOT_FOUND,"/error/404");
//                ErrorPage error500Page= new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/500");
//
//                factory.addErrorPages(error401Page,error404Page,error500Page);
            }
        };
    }
//  @Bean
//    public ErrorAttributes errorAttributes(){
//        return new MyErrorAttributers();
//  }
//  @Bean
//    public DefaultErrorViewResolver errorViewResolver(){
//      return new MyErrorViewResolver(this.applicationContext,              this.resourceProperties);
//  }
}
