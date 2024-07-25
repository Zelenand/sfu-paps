package org.example.model;

import jakarta.persistence.Entity;

@Entity
public class ResumeImpl extends Record implements IResume{
  Object resumeSpecificData;


  @Override
  public void setResumeSpecificData(Object resumeSpecificData) {
    this.resumeSpecificData = resumeSpecificData;
  }

  public Object getResumeSpecificData() {
    return resumeSpecificData;
  }
}
