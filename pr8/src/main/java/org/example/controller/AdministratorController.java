package org.example.controller;

import org.example.model.RecordDataRepository;
import org.example.model.User;
import org.example.service.EmailSystem;
import org.example.model.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdministratorController {
  UserDataRepository userDataRepository;
  RecordDataRepository recordDataRepository;

  @Autowired
  public AdministratorController(UserDataRepository userDataRepository, RecordDataRepository recordDataRepository) {
    this.userDataRepository = userDataRepository;
    this.recordDataRepository = recordDataRepository;
  }

  @PostMapping
  public void sendModerationEmail(User user){
    //работа с EmailSystem
    //EmailSystem.sendEmail();
  }

  @DeleteMapping
  public void deleteUser(Long id){}

  @DeleteMapping()
  public void deleteRecord(@PathVariable Long id){}
}
