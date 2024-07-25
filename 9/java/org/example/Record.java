package org.example;

public abstract class Record {
  Object nonSpecificData;

  public void setNonSpecificData(Object nonSpecificData) {
    this.nonSpecificData = nonSpecificData;
  }

  public Object getNonSpecificData() {
    return nonSpecificData;
  }
}