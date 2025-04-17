package com.userapp.main;

import com.userapp.service.IUserService;
import com.userapp.service.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        IUserService service = new UserServiceImpl();

        service.validateUsername("Saran");
        service.checkPassword("Sara@31");
    }
}
