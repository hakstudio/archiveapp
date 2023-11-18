package com.hakstudio.archiveapp.controller;

import com.hakstudio.archiveapp.entity.User;
import com.hakstudio.archiveapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        //custom exception ekle
        return userRepository.findById(userId).orElse(null);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User presentUser = userOptional.get();
            presentUser.setTc(user.getTc());
            presentUser.setName(user.getName());
            presentUser.setSurname(user.getSurname());
            presentUser.setAccessAuth(user.getAccessAuth());
            presentUser.setHideCreator(user.isHideCreator());
            return userRepository.save(presentUser);
        }
        else return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userRepository.deleteById(userId);
    }
}
