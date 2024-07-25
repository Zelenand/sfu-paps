package org.example;

import org.springframework.stereotype.Service;

@Service
public class UserFactoryImpl extends UserFactory {

  @Override
  public User createUser(Object userData) {
    User user = new UserImpl();
    user.setUserData(userData);
    return user;
  }
}
