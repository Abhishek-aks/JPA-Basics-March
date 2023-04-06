package com.hindustaniBhau.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    /* How are we able to create an object of Interface?
 Answer - Normally we cannot make an object of the interface
 but we can make/create an object of interface whose implementation has been given
 if there is a class implementing that interface, then we can make the object of that interface.
 */
    public String addUser(User user){
        userRepository.save(user); // save is the function that automatically save the code and no need of writing sql query/commands
        return "User added";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
        // findById() - gives optional Answer either value of null
        // .get() - if id searched is 4 but total id is only 3- it should give null
        // so to make option datatype to pure datatype .get() method is used
    }

    public String deleteUser(int rollNo){
        userRepository.deleteById(rollNo);
        return "User following Rollno has been deleted";
    }
    public String delUsers(){
        userRepository.deleteAll();
        return "All User Got Deleted";
    }

    public void updateStatus(Integer id) {
    }
}
