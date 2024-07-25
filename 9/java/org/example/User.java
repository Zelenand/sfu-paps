package org.example;

public abstract class User {
  Object userData;

  public void setUserData(Object userData) {
    this.userData = userData;
  }

  public Object getUserData() {
    return userData;
  }
}
