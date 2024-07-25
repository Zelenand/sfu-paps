package org.example;

import org.springframework.stereotype.Controller;

@Controller
public class AdministratorController {
  UserDataRepository userDataRepository;
  RecordDataRepository recordDataRepository;

  public AdministratorController(UserDataRepository userDataRepository, RecordDataRepository recordDataRepository) {
    this.userDataRepository = userDataRepository;
    this.recordDataRepository = recordDataRepository;
  }

  public void sendModerationEmail(User user){
    //работа с EmailSystem
    //EmailSystem.sendEmail();
  }
  public void deleteUser(User user){}

  public void deleteRecord(User user){}
}
