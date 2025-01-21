package com.admin.users;

import java.util.Arrays;
import java.util.List;

public class AddUser {
    public List<String> getUser() {
        return Arrays.asList("Durgesh", "Ravindra", "Sachin");
    }

    public static void main(String[] args) {
        System.out.println("admin module");
        System.out.println("Adding user");
        new AddUser().getUser().forEach(System.out::println);
    }
}
