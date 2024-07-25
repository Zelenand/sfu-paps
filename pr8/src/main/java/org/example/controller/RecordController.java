package org.example.controller;

import org.example.model.*;
import org.example.model.Record;
import org.example.service.PaymentSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {
  RecordFactory recordFactory;
  RecordDataRepository recordDataRepository;

  @Autowired
  public RecordController(RecordDataRepository recordDataRepository, RecordType type) {
    switch (type) {
      case VACANCY -> recordFactory = new VacancyFactoryImpl();
      case RESUME -> recordFactory = new ResumeFactoryImpl();
    }
    this.recordDataRepository = recordDataRepository;
  }

  @PostMapping
  public void registerRecord(Object nonSpecificRecordData, Object specificRecordData) {
    Record record = recordFactory.createRecord(nonSpecificRecordData, specificRecordData);
    // Работа с recordDataRepository
  }

  @GetMapping
  public Record getRecord(Long id) {
    // Работа с recordDataRepository
    return null;
  }

  @GetMapping
  public List<Record> getRecords(List<Long> ids) {
    // Работа с recordDataRepository
    return null;
  }

  @PostMapping
  public void promoteRecord(Record record){
    // Работа с paymentSystem
    PaymentSystem.makePayment();
  }
}
