package com.server.springdev.user.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.server.springdev.user.model.User;
import com.server.springdev.user.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  private Logger logger = LoggerFactory.getLogger(UserService.class);

  public List<User> getUserList() {
    return userRepository.findAll();
  }

  public User getUser(String id) {
    Optional<User> user = userRepository.findById(id);
    if (user.isPresent()) return user.get();
    else return null;
  }

  public User postUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(String id) {
    userRepository.deleteById(id);
    return;
  }
}