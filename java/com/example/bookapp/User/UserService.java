package com.example.bookapp.User;

import com.example.bookapp.error.UserNotFoundException;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserByEmailAndPassword(String email, String password) throws UserNotFoundException;

    User getUserByUserId(Long userId );
}
