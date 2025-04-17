package com.userapp.service;

public class UserServiceImpl implements IUserService {

    @Override
    public void validateUsername(String username) {
        if (username.equals("Saran")) {
            System.out.println("Welcome " + username);
        } else {
            System.out.println("Invalid username.");
        }
    }

    @Override
    public void checkPassword(String password) {
        int length = password.length();
        if (length < 5) {
            System.out.println("Too short");
        } else if (length > 15) {
            System.out.println("Too long");
        } else {
            System.out.println("Perfect password");
        }
    }
}