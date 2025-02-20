package com.lcwd.mvc.SpringMvcProject.controllers.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="lcwd.config")
@Component
public class LCWDConfig {

    private String name;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "LCWDConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExpTIme=" + emailExpTIme +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmailExpTIme() {
        return emailExpTIme;
    }

    public void setEmailExpTIme(int emailExpTIme) {
        this.emailExpTIme = emailExpTIme;
    }

    private int emailExpTIme;


}
