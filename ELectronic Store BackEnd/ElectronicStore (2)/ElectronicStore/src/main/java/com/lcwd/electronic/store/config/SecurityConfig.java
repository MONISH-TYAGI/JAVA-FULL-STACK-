package com.lcwd.electronic.store.config;

//import com.lcwd.electronic.store.security.JwtAuthenticationEntryPoint;
//import com.lcwd.electronic.store.security.JwtAuthenticationFilter;
import com.lcwd.electronic.store.security.JWTAuthenticationFilter;
import com.lcwd.electronic.store.security.JwtAuthenticationEntryPoint;
import jakarta.servlet.http.HttpServletRequest;
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
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasRole;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {


    @Autowired
    private JWTAuthenticationFilter filter;
    @Autowired
    private JwtAuthenticationEntryPoint entryPoint;

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
//
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
//  //  users create
//  //  InMemoryUserDetailsManager- is implementation class of UserDetailService
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

        security.cors(httpSecurityCorsConfigurer ->
                        httpSecurityCorsConfigurer.configurationSource(new CorsConfigurationSource() {
                            @Override
                            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                                CorsConfiguration corsConfiguration = new CorsConfiguration();

                                //origins
                                //methods
//                        corsConfiguration.addAllowedOrigin("http://localhost:4200");

//                                =corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200", "http://localhost:4300", "http://localhost:4300"));
                                corsConfiguration.setAllowedOriginPatterns(List.of("*"));
                                corsConfiguration.setAllowedMethods(List.of("*"));
                                corsConfiguration.setAllowCredentials(true);
                                corsConfiguration.setAllowedHeaders(List.of("*"));
                                corsConfiguration.setMaxAge(4000L);


                                return corsConfiguration;
                            }
                        })
        );

        //isko ham log baad mein sikhenge
        security.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());


        security
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(request ->
                request.requestMatchers(HttpMethod.DELETE,"/users/**").hasRole("ADMIN")
                .requestMatchers (HttpMethod.PUT,  "/users/**").hasAnyRole("ADMIN")
                .requestMatchers(HttpMethod.GET,  "/products/**").permitAll()
                .requestMatchers ( HttpMethod.POST,"/products/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET,  "/users/**").permitAll()
                .requestMatchers (HttpMethod.GET,  "/categories/").permitAll()
                .requestMatchers ( "/categories/").hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/auth/generate-token", "/auth/login-with-google", "/auth/regenerate-token").permitAll()
                        .requestMatchers("/auth/**").authenticated()
                        .anyRequest().permitAll()

        );


        //kis type ki security:
//        security.httpBasic(Customizer.withDefaults());

        //entry point
        security.exceptionHandling(ex -> ex.authenticationEntryPoint(entryPoint));

        //session creation policy
        security.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        //main -->
        security.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return security.build();
    }

    //    password encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }



}