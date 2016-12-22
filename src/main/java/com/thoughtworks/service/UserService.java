package com.thoughtworks.service;

import com.thoughtworks.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{
    List<User> findAll();

    User save(User user);
}
