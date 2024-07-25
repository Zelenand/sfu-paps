package org.example.controller;

import org.example.database.RecordDataRepository;
import org.example.database.UserDataRepository;
import org.example.model.User;

public class AdministratorController {
  UserDataRepository userDataRepository;
  RecordDataRepository recordDataRepository;

  public AdministratorController(UserDataRepository userDataRepository, RecordDataRepository recordDataRepository) {
    this.userDataRepository = userDataRepository;
    this.recordDataRepository = recordDataRepository;
  }

  void deleteUser(User user){}

  void deleteRecord(User user){}
}
