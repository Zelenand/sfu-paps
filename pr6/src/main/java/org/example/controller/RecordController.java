package org.example.controller;

import org.example.database.RecordDataRepository;
import org.example.model.*;
import org.example.model.Record;
import org.example.service.PaymentSystem;

public class RecordController {
  RecordFactory recordFactory;
  PaymentSystem paymentSystem;
  RecordDataRepository recordDataRepository;

  public RecordController(RecordDataRepository recordDataRepository, RecordType type) {
    switch (type) {
      case VACANCY -> recordFactory = new VacancyFactoryImpl();
      case RESUME -> recordFactory = new ResumeFactoryImpl();
    }

    this.recordDataRepository = recordDataRepository;
    this.paymentSystem = PaymentSystem.getInstance();
  }

  public void registerRecord(Object nonSpecificRecordData, Object specificRecordData) {
    Record record = recordFactory.createRecord(nonSpecificRecordData, specificRecordData);
    // Работа с recordDataRepository
  }

  public void promoteRecord(Record record){
    // Работа с paymentSystem
  }
}
