package com.xt.config;

import com.xt.filter.LoginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2017/7/31.
 */

@Configuration
public class WebConfig  {

    /**
     * Login filter filter registration bean.
     * 配置登录过滤器
     * @return the filter registration bean
     */
    @Bean(name = "loginFilter")
    public FilterRegistrationBean loginFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new LoginFilter());
        bean.addUrlPatterns("/help");
        bean.addUrlPatterns("/");

        return bean;
    }

}
