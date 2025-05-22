package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {

	   @Autowired
	    private UserService userService;

	    @PostMapping("/post")
	    public User saveUser(@RequestBody User user) {
	        return userService.saveUser(user);
	    }

	    @GetMapping("/get")
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("getby/{id}")
	    public Optional<User> getUserById(@PathVariable Long id) {
	        return userService.getUserById(id);
	    }

	    @DeleteMapping("deletby/{id}")
	    public String deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return "User deleted successfully";
	    }
	    @PostMapping("/getdto")
	    public User saveUser(@RequestBody UserDto userDto) {
	        return userService.saveUser(userDto);
	    }
}
