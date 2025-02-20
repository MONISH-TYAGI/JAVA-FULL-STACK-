package com.lcwd.withoutboot.config;

import com.lcwd.withoutboot.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.lcwd.withoutboot"})
public class AppConfig {
@Bean("cartService1")
    public CartService cartService(){
    return new CartService();
}
}
