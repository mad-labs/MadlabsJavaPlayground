package it.madlabs.playground.calculator.logic;

import it.madlabs.playground.calculator.utils.MattyCalculatorUtils;

/*
 * What to do:
 * Create a object that is used in PlayGroundCalculator class.
 * 
 * Delete the comment in the PlayGroundCalculator after completation of every level.
 */
public class MattyCalculator {

    double result = 0;
    public double x;
    public double y;
    MattyCalculatorUtils mattyCalculatorUtils = new MattyCalculatorUtils();

    // // Hint: try to decomment code below, it could not work, but maybe it will aid you!
    public MattyCalculator(String creationMessage) {
        System.out.println("@@@ new MattyCalculator created with message: " + creationMessage + " @@@");
    }

    // // Hint: try to decomment code below, it could not work, but maybe it will aid you!
    public void start() {
        System.out.println("@@@ Starting MattyCalculator... @@@");
    }
    public double getResult(){
        return result;
    }
    
     
    public void setX(double n){
        this.x = n;
        }
    public void setY(double n){
        this.y = n;
        
        }
    public void sum(){
        result = x + y;
    }
    
    public void subtract(){
        result = x - y;
    }
    public void multiply(){
        result = x * y;
    }
    public void divide(){
        result = x / y;
    }
    public void askX(){
        this.x = mattyCalculatorUtils.askADouble("Inserisci il valore di x : ");
        
    }
    
    public void askY(){
        this.y = mattyCalculatorUtils.askADouble("Inserisci il valore di y : ");
        
    }
    
    
    
    public void askOperation(){
    String Operation = mattyCalculatorUtils.askAString("Inserisci l'operazione desiderata tra le seguenti : +  -  *  / ");
    switch(Operation){
        case "+" :
            this.sum();
            break;
        case "-" :
            this.subtract();
            break;
        case "*" :
            this.multiply();
            break;
        case "/" :
            this.divide();
            break;
        default : 
            System.out.println("Invalid operation!!!");
      } 
    }
    
    public void showResult(){
        this.getResult();
        System.out.println(result);
    }
    
    
   
        
    
   
    

   
    

  

}
