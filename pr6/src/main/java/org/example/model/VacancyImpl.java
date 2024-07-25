package org.example.model;

public class VacancyImpl extends Record implements IVacancy{
  Object vacancySpecificData;


  @Override
  public void setVacancySpecificData(Object vacancySpecificData) {
    this.vacancySpecificData = vacancySpecificData;
  }
}
