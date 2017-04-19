package it.madlabs.playground.calculator.utils;

import java.util.Scanner;

public class MattyCalculatorUtils {

  private Scanner scanner = new Scanner(System.in);

  public double askADouble(String messageToDisplay){
    System.out.println(" > " + messageToDisplay);
    System.out.print(" < ");
    return scanner.nextDouble();
  }

  public String askAString(String messageToDisplay){
    System.out.println(" > " + messageToDisplay);
    System.out.print(" < ");
    return scanner.next();
  }

}