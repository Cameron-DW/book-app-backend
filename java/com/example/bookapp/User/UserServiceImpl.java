package com.example.bookapp.User;

import com.example.bookapp.error.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        System.out.println(user);
        System.out.println(user.getFirstName());

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmailAndPassword(String email, String password) throws UserNotFoundException {

        Optional<User> user =  userRepository.getUserByEmailAndPassword(email, password);
        if (user.isEmpty() ){
            throw new UserNotFoundException("User Not Found");
        }
        return user.get();

    }

    @Override
    public User getUserByUserId(Long userId){
        System.out.println("GetUserByUserId: " + userId);
        return userRepository.getUserByUserId(userId);
    }
}
