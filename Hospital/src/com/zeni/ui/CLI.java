package com.zeni.ui;

import com.zeni.logic.InformationAboutPacients;
import com.zeni.model.Patient;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class CLI {
  
  private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
  
  public static void init() {
    getDiagnosPacientPrint();
    getNumberMedCardPacientPrint();
  }
  
  private static String getDiagnosPacientPrint() {
    String diagnosPacient;
    System.out.print("Введіть діагноз: ");
    
    if (scanner.hasNext()) {
      diagnosPacient = scanner.next();
      List<Patient> pacients = InformationAboutPacients.getDiagnos(diagnosPacient);
      
      for (Patient pacient : pacients) {
        System.out.printf("%s%n", pacient);
      }
      
    } else {
      System.out.println("Спробуйте знову.");
      scanner.next();
      diagnosPacient = getDiagnosPacientPrint();
    }
    
    return diagnosPacient;
  }
  
  private static int getNumberMedCardPacientPrint() {
    int numMedCard1, numMedCard2;
    
    System.out.println("Введіть початок діапазону номеру медичної картки: ");
    numMedCard1 = scanner.nextInt();
    
    System.out.println("Введіть кінець діапазону номеру медичної картки: ");
    numMedCard2 = scanner.nextInt();
    
    if (numMedCard1 > numMedCard2) {
      int temp = numMedCard1;
      numMedCard1 = numMedCard2;
      numMedCard2 = temp;
      
      System.out.println("Початоком діапазону не може бути більшим ніж кінець");
      numMedCard1 = getNumberMedCardPacientPrint();
    }
    
    List<Patient> pacients = InformationAboutPacients.getNumMedCard(numMedCard1, numMedCard2);
    
    for (Patient pacient : pacients) {
      System.out.printf("%s%n", pacient);
    }
    
    return 1;
  }
}
