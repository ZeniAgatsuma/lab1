package com.zeni.logic;

import com.zeni.model.Patient;
import java.util.Arrays;
import java.util.List;

public class InformationAboutPacients {
  
  private static final Patient[] patients = {
      new Patient("Максим", "Козлов", "Петрович",
          "Львівська область, місто Львів, просп. Паторжинського, 98", 41341, "ДЦП"),
      new Patient("Станіслав", "Росада", "Юрійович",
          "Одеська область, місто Одеса, вул. Шота Руставелі, 48", 24342, "ДЦП"),
      new Patient("Роман", "Ганич", "Максимович",
          "Сумська область, місто Суми, просп. Різницька, 18", 14234, "Артрит"),
      new Patient("Олександр", "Дмитрович", "Ханін",
          "Черкаська область, місто Черкаси, пров. Паторжинського, 71", 54343, "Алкоголізм"),
      new Patient("Максим", "Зирнзнак", "Іванович",
          "Харківська область, місто Харків, пров. Володимирська, 30", 24133, "Анімефілія"),
      new Patient("Юрій", "Жулканич", "Юрійович",
          "Луганська область, місто Луганськ, вул. Арсенальна, 95", 12543, "Дотер"),
  };
  
  public static List<Patient> getDiagnos(String diagnosPacient) {
    return Arrays.stream(patients)
        .filter(patient -> patient.diagnosis().equalsIgnoreCase(diagnosPacient))
        .toList();
  }
  
  public static List<Patient> getNumMedCard(int numMedCard1, int numMedCard2) {
    return Arrays.stream(patients)
        .filter(
            patient -> numMedCard1 <= patient.numMedCard() && patient.numMedCard() <= numMedCard2)
        .toList();
  }
}
