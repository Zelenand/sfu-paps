package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class User {
  Object userData;
  private Long id;

  public void setUserData(Object userData) {
    this.userData = userData;
  }

  public Object getUserData() {
    return userData;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  public Long getId() {
    return id;
  }
}
