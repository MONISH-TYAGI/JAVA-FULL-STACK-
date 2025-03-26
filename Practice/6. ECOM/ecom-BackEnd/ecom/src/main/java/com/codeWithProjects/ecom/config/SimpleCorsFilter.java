package com.codeWithProjects.ecom.config;

import com.codeWithProjects.ecom.filters.JwtRequestFilter;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.core.Ordered;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCorsFilter implements Filter {


    private final JwtRequestFilter authFilter;


    @Value("${app.client.url}")
    private String clientAppUrl="";

    public SimpleCorsFilter(JwtRequestFilter authFilter){

        this.authFilter = authFilter;
    }

    @Override
    public void doFIlter(ServletRequest req, ServletResponse res,FIlterChain chain) throws IOException, SerialException
    {
        HttpServletResponse response=(HttpServletResponse) res;
        HttpServletRequest request=(HttpServletRequest) req;
        Map<String,String> map=new HashMap<>();
        String originHeader=request.getHeader("origin");
        response.setHeader("Access-Control-Allow-Origin",originHeader);
        response.setHeader("Access-Control-Allow-Methods","POST,  GET, PUT,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","*");

        if("OPTIONS".equalsIgnoreCase(request.getMethod()))
        {
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            chain.doFilter(req,res);
        }

    }

    @Override
    public void init (FilterConfig filterConfig)
    {

    }
}
