package com.example.Album.Service;

import com.example.Album.Model.User;
import com.example.Album.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


        @Autowired
        private UserRepository userRepository;
    public User getUser() {
        return userRepository.getUser();
    }
    public User saveUser(User user) {
        //UserRepository userRepository;
        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {

        return userRepository.getAllUsers();
    }

    public User getAlbumbyId(int albumId) {
        return userRepository.getAlbumbyId(albumId);
    }

    public User updateUser(int albumId, User user) {
        return userRepository.updateAlbum(albumId, user);
    }

    public User deleteUser(int albumId) {
        return userRepository.deletedalbum(albumId);
    }
}


