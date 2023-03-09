package com.hindustaniBhau.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get_users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    // delete by a roll no

    // delete all the users

    // update a user by id

}
