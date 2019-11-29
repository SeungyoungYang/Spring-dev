package com.server.springdev.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.server.springdev.user.model.User;
import com.server.springdev.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<User> getUserList() {
    return userService.getUserList();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable("id") String id) {
    return userService.getUser(id);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public User postUser(@RequestBody User user) {
    return userService.postUser(user);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {
    userService.deleteUser(id);
    return new ResponseEntity<String>("Delete User Success", HttpStatus.OK);
  }
}