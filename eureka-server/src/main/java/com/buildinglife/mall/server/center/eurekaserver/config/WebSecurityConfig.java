package com.buildinglife.mall.server.center.eurekaserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 后期开启服务认证配合oauth2.0的时候使用
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * 默认情况下，当Spring Security位于类路径上时，它将要求在应用程序的每个请求中发送有效的CSRF令牌。
         * Eureka客户端通常不会拥有有效的跨站点请求伪造（CSRF）令牌，您需要为/eureka/**端点禁用此要求。
         */
        http.csrf().disable();
        super.configure(http);
    }
}
