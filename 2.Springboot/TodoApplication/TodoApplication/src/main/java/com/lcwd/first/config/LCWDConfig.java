package com.lcwd.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="lcwd.config")
@Component
public class LCWDConfig {
    private String name;
    private String password;
    private String email;
    private int emailExpTime;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {  // ADD THIS
        this.name = name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {  // ADD THIS
        this.password = password;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {  // ADD THIS
        this.email = email;
    }

    // Getter and Setter for emailExpTime
    public int getEmailExpTime() {
        return emailExpTime;
    }
    public void setEmailExpTime(int emailExpTime) {  // ADD THIS
        this.emailExpTime = emailExpTime;
    }

    @Override
    public String toString() {
        return "LCWDConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExpTime=" + emailExpTime +
                '}';
    }
}
