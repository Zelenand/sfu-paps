package org.example;

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
