package com.lcwd.orm.learn_spring_orm.services.impl;

import com.lcwd.orm.learn_spring_orm.entities.User;
import com.lcwd.orm.learn_spring_orm.repository.UserRepository;
import com.lcwd.orm.learn_spring_orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user)
    {
        User savedUser=userRepository.save(user);
        logger.info("User saved:{}",savedUser.getId());
        return savedUser;
    }

    @Override
    public User updateUser(User user, int userId) {
        User user1 = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with given id not found "));
        user1.setName(user.getName());
        user1.setCity(user.getCity());
        user1.setAge(user.getAge());
        //rest of the details also be updated
//        2: update user
        User user2 = userRepository.save(user1);
        return user2;
    }

    @Override
    public void deleteUser(int userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user not found with given id"));
        userRepository.delete(user);
        //deleteAll()
        logger.info("user deleted ");
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public User getUser(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User with given id not found"));
        return user;
    }
}
