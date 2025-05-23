package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entity.User;
import com.example.demo.Repository.Userrepo;
@Service
public class UserService {

	 @Autowired
	    private Userrepo userRepository;

	    public User saveUser(User user) {
	        return userRepository.save(user);
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Optional<User> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	    public User saveUser(UserDto userDto) {
	        User user = new User();
	        user.setName(userDto.getName());
	        user.setEmail(userDto.getEmail());
	        return userRepository.save(user);
	    }
}
