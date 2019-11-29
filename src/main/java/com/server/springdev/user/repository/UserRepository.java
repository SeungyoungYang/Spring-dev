package com.server.springdev.user.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.server.springdev.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {
  List<User> findByName(String name);
}