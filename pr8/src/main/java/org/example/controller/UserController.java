package org.example.controller;

import org.example.model.User;
import org.example.model.UserDataRepository;
import org.example.model.UserFactory;
import org.example.service.EmailSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
  UserFactory userFactory;
  UserDataRepository userDataRepository;

  @Autowired
  public UserController(UserFactory userFactory, UserDataRepository userDataRepository) {
    this.userFactory = userFactory;
    this.userDataRepository = userDataRepository;
  }

  @PostMapping
  public void registerUser(Object userData) {
    User user = userFactory.createUser(userData);
    // Работа с userDataRepository
  }

  @GetMapping
  public User getUser(Long id) {
    // Работа с userDataRepository
    return null;
  }

  @GetMapping
  public List<User> getUsers(List<Long> ids) {
    // Работа с userDataRepository
    return null;
  }

  @PostMapping
  public void sendConfirmationEmail(User user){
    //работа с EmailSystem
    //EmailSystem.sendEmail();
  }

  @PostMapping
  public void sendPasswordRestorationEmail(User user){
    //работа с EmailSystem
  }
}
