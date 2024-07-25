package org.example.controller;


import org.example.database.UserDataRepository;
import org.example.model.User;
import org.example.model.UserFactory;
import org.example.service.EmailSystem;
import org.example.service.PaymentSystem;

public class UserController {
  UserFactory userFactory;
  EmailSystem emailSystem;
  UserDataRepository userDataRepository;

  public UserController(UserFactory userFactory, UserDataRepository userDataRepository) {
    this.userFactory = userFactory;
    this.userDataRepository = userDataRepository;
    this.emailSystem = EmailSystem.getInstance();
  }

  public User createUser() {
    User user = userFactory.createUser();

    return user;
  }

  public void sendConfirmationEmail(User user){
    //работа с EmailSystem
  }
}
