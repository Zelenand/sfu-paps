package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Record {
  Object nonSpecificData;
  private Long id;

  public void setNonSpecificData(Object nonSpecificData) {
    this.nonSpecificData = nonSpecificData;
  }

  public Object getNonSpecificData() {
    return nonSpecificData;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  public Long getId() {
    return id;
  }
}