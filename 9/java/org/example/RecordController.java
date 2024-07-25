package org.example;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RecordController {
  RecordFactory recordFactory;
  RecordDataRepository recordDataRepository;

  public RecordController(RecordDataRepository recordDataRepository, RecordType type) {
    switch (type) {
      case VACANCY -> recordFactory = new VacancyFactoryImpl();
      case RESUME -> recordFactory = new ResumeFactoryImpl();
    }
    this.recordDataRepository = recordDataRepository;
  }

  public void registerRecord(Object nonSpecificRecordData, Object specificRecordData) {
    Record record = recordFactory.createRecord(nonSpecificRecordData, specificRecordData);
    // Работа с recordDataRepository
  }

  public Record getRecord() {
    // Работа с recordDataRepository
    return null;
  }

  public List<Record> getRecords() {
    // Работа с recordDataRepository
    return null;
  }

  public void promoteRecord(Record record){
    // Работа с paymentSystem
    PaymentSystem.makePayment();
  }
}
