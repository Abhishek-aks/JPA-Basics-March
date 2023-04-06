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
    @GetMapping("/del_roll")
    public String deleteUser(@RequestParam("rollNo") int rollNo){
        userService.deleteUser(rollNo);
        return "User following Rollno has been deleted";
    }

    // delete all the user
    @DeleteMapping("/deluser")
    public String delUsers(){
        userService.delUsers();
        return "Users has been deleted";
    }

    // update user by id
    @PutMapping("/change")
    public void updateStatus(@RequestParam Integer id){
        userService.updateStatus(id);
    }

//    @PutMapping("/update")
//    public ResponseEntity<Admin> updateAdminPassword(@RequestParam Integer adminId, @RequestParam String password){
//        Admin updatedAdmin = adminService.updatePassword(adminId, password);
//        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
//    }

}
