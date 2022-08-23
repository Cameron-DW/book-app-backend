package com.example.bookapp.User;

import com.example.bookapp.error.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user")
    public User getUserByUserId(@RequestBody User user){return userService.getUserByUserId(user.getUserId());}

//    We are passing JSON object for the email and the password, so we need to pass it as a String
//@CrossOrigin
    @PostMapping("/user/login")
    public User getUser(@RequestBody User user) throws UserNotFoundException {
        System.out.println( "\n\n\n\n\n\n\n\n\n\n" + user.getEmail() + user.getPassword());
//        return userService.saveUser(user);

         User returnedUser = userService.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
        System.out.println(returnedUser);
        return returnedUser;
    }



}
