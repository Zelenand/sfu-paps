package org.example;

public class VacancyImpl extends Record implements IVacancy{
  Object vacancySpecificData;


  @Override
  public void setVacancySpecificData(Object vacancySpecificData) {
    this.vacancySpecificData = vacancySpecificData;
  }

  public Object getVacancySpecificData() {
    return vacancySpecificData;
  }
}
