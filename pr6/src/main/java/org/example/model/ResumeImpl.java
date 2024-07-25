package org.example.model;

public class ResumeImpl extends Record implements IResume{
  Object resumeSpecificData;


  @Override
  public void setResumeSpecificData(Object resumeSpecificData) {
    this.resumeSpecificData = resumeSpecificData;
  }
}
