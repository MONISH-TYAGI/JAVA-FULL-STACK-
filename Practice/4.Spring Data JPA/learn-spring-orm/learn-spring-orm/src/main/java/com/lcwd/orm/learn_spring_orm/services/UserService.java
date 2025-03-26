package com.lcwd.orm.learn_spring_orm.services;

import com.lcwd.orm.learn_spring_orm.entities.User;

import java.util.List;

public interface UserService {

    //done
    User saveUser(User user);

    //done
    User updateUser(User user, int userId);


    void deleteUser(int userId);

    //done
    List<User> getAllUser();

    //done
    User getUser(int userId);
}
