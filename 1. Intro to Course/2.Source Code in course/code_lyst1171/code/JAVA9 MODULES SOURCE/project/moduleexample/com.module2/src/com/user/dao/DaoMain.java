package com.user.dao;

import com.p1.services.LoginService;

public class DaoMain {
    public static void main(String[] args) {
        System.out.println("Dao main method");
        LoginService service=new LoginService();
        service.login();
    }
}
