package com.p1.services;

public class LoginService {
    public void login() {
        System.out.println("Logging in");
    }

    public void logout() {
        System.out.println("Logout");
    }

    private void privateMethod() {
        System.out.println(" this is private method ");

        int exports=345;
        System.out.println(exports);
    }
}
