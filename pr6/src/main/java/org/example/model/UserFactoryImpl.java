package org.example.model;

public class UserFactoryImpl extends UserFactory {

  @Override
  public User createUser() {
    User user = new UserImpl();
    return user;
  }
}
