package com.server.springdev.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

  @Id
  private String id;

  private String pw;
  private String name;
  private String auth;

  public User(String id, String pw, String name, String auth) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.auth = auth;
  }

  public User() {
  }

  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public String getName() {
    return name;
  }

  public String getAuth() {
    return auth;
  }

  @Override
  public String toString() {
    return String.format("{id: %s, pw: %s, name: %s, auth: %s}", id, pw, name, auth);
  }

}