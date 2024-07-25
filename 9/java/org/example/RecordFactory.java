package org.example;

public abstract class RecordFactory {
  public Record createRecord (Object nonSpecificData, Object specificData){
    Record record = getRecordWithNonSpecificData(nonSpecificData);
    record = getRecordWithSpecificData(record, specificData);
    return record;
  }

  public abstract Record getRecordWithNonSpecificData(Object nonSpecificData);

  public abstract Record getRecordWithSpecificData(Record record, Object SpecificData);

}
