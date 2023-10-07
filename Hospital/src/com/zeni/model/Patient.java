package com.zeni.model;

import java.util.StringJoiner;

public record Patient(String name, String surName, String middleName, String adress,
                      int numMedCard, String diagnosis) {
  
  @Override
  public String toString() {
    return new StringJoiner(", ", "Пацієнт ", "")
        .add("ПІБ: '%s'".formatted(name + " " + surName + " " + middleName))
        .add("Адресса: '%s'".formatted(adress))
        .add("Мед карта номер: '%d'".formatted(numMedCard))
        .add("Діагноз: '%s'".formatted(diagnosis))
        .toString();
  }
  
}
