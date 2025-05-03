package com.lcwd.electronic.store.config;

//import com.lcwd.electronic.store.security.JwtAuthenticationEntryPoint;
//import com.lcwd.electronic.store.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {


    private final String[] PUBLIC_URLS = {

            "/swagger-ui/**",
            "/webjars/**",
            "/swagger-resources/**",
            "/v3/api-docs",
            "/v2/api-docs",
            "/test"


    };

//    @Bean
//    public UserDetailsService userDetailsService() {

//        UserDetails normal = User.builder()
//                .username("Ankit")
//                .password(passwordEncoder().encode("ankit"))
//                .roles("NORMAL")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("Durgesh")
//                .password(passwordEncoder().encode("durgesh"))
//                .roles("ADMIN")
//                .build();
    //users create
    //InMemoryUserDetailsManager- is implementation class of UserDetailService
//        return new InMemoryUserDetailsManager(normal, admin);
//    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {


//
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and().
//                formLogin()
//                .loginPage("login.html")
//                .loginProcessingUrl("/process-url")
//                .defaultSuccessUrl("/dashboard")
//                .failureUrl("/error")
//                .and()
//                .logout()
//                .logoutUrl("/do-logout");


        security.authorizeHttpRequests(request ->
                request.requestMatchers(HttpMethod.DELETE,"/users/**").hasRole("ADMIN")
                .requestMatchers (HttpMethod.PUT,  "/users/**").hasAnyRole("ADMIN")
                .requestMatchers(HttpMethod.GET,  "/products/**").permitAll()
                .requestMatchers ( HttpMethod.POST,"/products/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET,  "/users/").permitAll()
                .requestMatchers (HttpMethod.GET,  "/categories/").permitAll()
                .requestMatchers ( "/categories/").hasRole("ADMIN")
        );



//kis type ki security:

        security.httpBasic(Customizer.withDefaults());

        return security.build();
    }







}