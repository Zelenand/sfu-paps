package org.example.model;

public class ResumeFactoryImpl extends RecordFactory{

  @Override
  public Record getRecordWithNonSpecificData(Object nonSpecificData) {
    ResumeImpl resume = new ResumeImpl();
    resume.setNonSpecificData(nonSpecificData);
    return resume;
  }

  @Override
  public Record getRecordWithSpecificData(Record record, Object resumeSpecificData) {
    ResumeImpl resume = (ResumeImpl) record;
    resume.setResumeSpecificData(resumeSpecificData);
    return resume;
  }
}
