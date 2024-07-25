package org.example;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecordDataRepository {
  public void insertVacancy(IVacancy vacancy){
    //работа с SQL
  }

  public void insertResume(IResume resume){
    //работа с SQL
  }

  public IVacancy getVacancy(int id){
    //работа с SQL
    return null;
  }

  public IResume getResume(int id){
    //работа с SQL
    return null;
  }

  public List<IVacancy> getAllVacancies(){
    //работа с SQL
    return null;
  }

  public List<IResume> getResumes(){
    //работа с SQL
    return null;
  }
}
