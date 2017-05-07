package it.madlabs.playground.calculator.utils;

import java.util.Scanner;

public class MattyCalculatorUtils {

  private Scanner scanner = new Scanner(System.in);

  public double askADouble(String messageToDisplay){
    System.out.println(" > " + messageToDisplay);
    System.out.print(" < ");
    try {
      return scanner.nextDouble();
    } catch (Exception e) {
      scanner.next();
      throw e;
    }
  }

  public String askAString(String messageToDisplay){
    System.out.println(" > " + messageToDisplay);
    System.out.print(" < ");
    try {
      return scanner.next();
    } catch (Exception e) {
      scanner.next();
      throw e;
    }
  }

}