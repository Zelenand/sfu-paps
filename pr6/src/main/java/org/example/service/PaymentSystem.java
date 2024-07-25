package org.example.service;

public final class PaymentSystem {
  private static PaymentSystem instance;

  public void makePayment(){
    //работа с внешней системой оплаты
  }

  public static PaymentSystem getInstance() {
    if (instance == null) {
      instance = new PaymentSystem();
    }
    return instance;
  }
}
