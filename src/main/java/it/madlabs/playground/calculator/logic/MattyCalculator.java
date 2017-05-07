package it.madlabs.playground.calculator.logic;

import it.madlabs.playground.calculator.utils.MattyCalculatorUtils;

/*
 * What to do:
 * Create a object that is used in PlayGroundCalculator class.
 * 
 * Delete the comment in the PlayGroundCalculator after completation of every level.
 */
  public class MattyCalculator {

    private double x = 0d;
    private double y = 0d;
    private double result = 0d;
    private String op = "";
    private MattyCalculatorUtils mattyCalculatorUtils = new MattyCalculatorUtils();
    
    // Hint: try to decomment code below, it could not work, but maybe it will aid you!
    public MattyCalculator(String creationMessage){
      System.out.println("@@@ new MattyCalculator created with message: " + creationMessage + " @@@");
    }

    // Hint: try to decomment code below, it could not work, but maybe it will aid you!
    public void start(){
      System.out.println("@@@ Starting MattyCalculator... @@@");
    }

    // Hint: try to decomment code below, it could not work, but maybe it will aid you!
    public double getResult(){
      return this.result;
    }

    private void calculateResultByStoredOperation(){
      switch (this.op) {
        case "+":
          this.sum();
          break;
        case "-":
          this.subtract();
          break;
        case "*":
          this.multiply();
          break;
        case "/":
          this.divide();
          break;
        default:
          throw new IllegalArgumentException("Argh! I don't know this operation! Going to kill myself!!!");
      }
    }

    public void setX(double x){
      this.x = x;
    }

    public void setY(double y){
      this.y = y;
    }

    public void sum(){
      this.result = x + y;
    }

    public void subtract(){
      this.result = x - y;
    }

    public void multiply(){
      this.result = x * y;
    }

    public void divide(){
      this.result = x / y;
    }

    public void askX(){
      this.x = this.mattyCalculatorUtils.askADouble("Please insert X value below: ");
    }

    public void askY(){
      this.y = this.mattyCalculatorUtils.askADouble("Please insert Y value below: ");
    }

    public void askOperation(){
      this.op = this.mattyCalculatorUtils.askAString("Please choose and opetation in '+', '-', '*', '/' and write it below: ");
    }

    public void showResult(){
      this.calculateResultByStoredOperation();
      System.out.println(" > Result is: " + this.result);
    }
}