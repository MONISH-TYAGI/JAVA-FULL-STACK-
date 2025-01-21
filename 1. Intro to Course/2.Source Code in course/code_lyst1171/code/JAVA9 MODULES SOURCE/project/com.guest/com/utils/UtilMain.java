package com.utils;

import com.admin.users.AddUser;

public class UtilMain {
    public static void main(String[] args) {

        System.out.println("Inside com.guest module");

        AddUser user = new AddUser();
        user.getUser().forEach(System.out::println);
        ;

    }
}
