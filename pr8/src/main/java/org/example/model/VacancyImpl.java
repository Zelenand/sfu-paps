package org.example.model;

import jakarta.persistence.Entity;

@Entity
public class VacancyImpl extends Record implements IVacancy{
  Object vacancySpecificData;
  private Long id;


  @Override
  public void setVacancySpecificData(Object vacancySpecificData) {
    this.vacancySpecificData = vacancySpecificData;
  }

  public Object getVacancySpecificData() {
    return vacancySpecificData;
  }
}
