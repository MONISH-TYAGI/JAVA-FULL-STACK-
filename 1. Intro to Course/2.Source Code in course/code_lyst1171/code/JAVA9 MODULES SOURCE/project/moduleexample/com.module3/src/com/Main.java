package com;

import com.p1.services.LoginService;
import com.user.dao.UserDao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LoginService service = new LoginService();
        service.login();


        Class<? extends LoginService> classOb = service.getClass();
        Method privateMethod = classOb.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(service);

        UserDao userDao=new UserDao();
        userDao.saveUser();
    }
}
