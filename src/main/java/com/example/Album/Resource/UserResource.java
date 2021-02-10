package com.example.Album.Resource;

import com.example.Album.Model.User;
import com.example.Album.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserResource {
    @Autowired
    private UserService userService;


        @GetMapping("/user")

        public User getUser() {
        return userService.getUser();
    }

        @PostMapping("/user")
        public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
        @GetMapping("/allUsers")
        public List<User> getAllUsers()
        {
            return userService.getAllUsers();
        }
        @GetMapping("/user/{albumId}")
        public User getUserbyId(@PathVariable("albumId") int albumId)
        {
            return userService.getAlbumbyId(albumId);
        }

        @PutMapping("/user/{albumId}")
        public User updateUser(@PathVariable("albumId") int albumId, @RequestBody User user)
        {
            return userService.updateUser(albumId, user);
        }

        @DeleteMapping("/user")
        public User deleteUser(@RequestParam(name = "albumId") int albumId)
        {
            return userService.deleteUser(albumId);
        }

    }

