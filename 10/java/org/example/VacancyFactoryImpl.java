package org.example;

public class VacancyFactoryImpl extends RecordFactory {

  @Override
  public Record getRecordWithNonSpecificData(Object nonSpecificData) {
    VacancyImpl vacancy = new VacancyImpl();
    vacancy.setNonSpecificData(nonSpecificData);
    return vacancy;
  }

  @Override
  public Record getRecordWithSpecificData(Record record, Object vacancySpecificData) {
    VacancyImpl vacancy = (VacancyImpl) record;
    vacancy.setVacancySpecificData(vacancySpecificData);
    return vacancy;
  }
}
