package it.madlabs.playground.calculator;

import java.io.IOException;
import java.lang.RuntimeException;
import java.util.Date;

import it.madlabs.playground.calculator.logic.MattyCalculator;

/**
 * Created by gabriele on 10/04/17.
 */
public class CalculatorApp {

	/*
	 * This is the starting point of our program. when program start it search in this class the main() method and execute it
	 * 
	 * As you can see out application, the MattyCalculator, is not here, is in an other class, called MattyCalculator.java,
	 * beacause is better to separate application logic from progam start. Now it can appear not so usefull, but there are many
	 * advantagesin using thit aproach:
	 * - you will have a class that can be reused in bigger programs
	 * - in different kind of envinroment will happen to not have control in stating of our application (eg. web application or Android)
	 * 
	 * To use this tutorial follow the instruction in this file, decommenting lines between 
	 * //START LEVEL X
   * [...]
	 * //END LEVEL X
	 * and improving the class MattyCalculator.java to compile without error and to have successfull test results
	 */
	public static void main (String[] args) throws IOException {
		System.out.println("Starting playGroundCalculator App main... ");
		
		/*
		 * LEVEL -1: create an instance of our application
		 * Your objective is to create a constructor with a string parameter in MattyCalculator.java to instantiate a new object
		 */

		// //START LEVEL -1
		// System.out.println("Creating new instance on MattyCalculator application");
		// MattyCalculator mattyCalculator = new MattyCalculator("Created at " + new Date());

		// //test the expected result
		// System.out.println("Testing initialization. mattyCalculator shuld not be null!");
		// if (mattyCalculator == null){
		// 	throw new RuntimeException("Error!!! mattyCalculator should not be null!! Instead is: " + mattyCalculator);
		// } else {
		// 	System.out.println("Test OK!");
		// }
		// //END LEVEL -1

		/*
		 * LEVEL 0: start our application
		 * Your objective is to create a method in MattyCalculator.java to start our application
		 */

		// //START LEVEL 0
		// System.out.println("Starting MattyCalculator application");
		// mattyCalculator.start();
		// //END LEVEL 0

		/*
		 * LEVEL 1: getting a result
		 * Your objective is to create a method in MattyCalculator.java to obtain result of calculation.
		 * You will need a field in the MattyCalculator.java to store result of calculation. Initialize it
		 * with 0
		 */

		// //START LEVEL 1
		// double result = mattyCalculator.getResult();

		// //test the expected result
		// System.out.println("Testing initialization. mattyCalculator.getResult() should return 0");
		// if (result != 0){
		// 	throw new RuntimeException("Error!!! the result should be 0!!! Instead is: " + result);
		// } else {
		// 	System.out.println("Test OK!");
		// }
		// //END LEVEL 1

		/*
		 * LEVEL 2: sum of 2 number
		 * Your objective is to create a method in MattyCalculator.java that stores 2 number, and a method to sum them.
		 * You will need some fields in the MattyCalculator.java to store x, y and result. Initialize them with 0
		 */

		// //START LEVEL 2
		// mattyCalculator.setX(10);
		// mattyCalculator.setY(5);
		// mattyCalculator.sum();
		// result = mattyCalculator.getResult();

		// //test the expected result
		// System.out.println("Testing: given x=10 and y=5, when call mattyCalculator.sum(), mattyCalculator.getResult() should return 15");
		// if (result != 15){
		// 	throw new RuntimeException("Error!!! the result should be 15!!! Instead is: " + result);
		// } else {
		// 	System.out.println("Test OK!");
		// }
		// //END LEVEL 2

		/*
		 * LEVEL 3: other operation
		 * Your objective is to create other operation: subtract, multiply, divide.
		 */
		// //START LEVEL 3
		// mattyCalculator.setX(10);
		// mattyCalculator.setY(5);

		// mattyCalculator.subtract();
		// result = mattyCalculator.getResult();

		// //test the expected result
		// System.out.println("Testing: given x=10 and y=5, when call mattyCalculator.subtract(), mattyCalculator.getResult() should return 5");
		// if (result != 5){
		// 	throw new RuntimeException("Error!!! the result should be 5!!! Instead is: " + result);
		// } else {
		// 	System.out.println("Test OK!");
		// }

		// mattyCalculator.multiply();
		// result = mattyCalculator.getResult();

		// //test the expected result
		// System.out.println("Testing: given x=10 and y=5, when call mattyCalculator.multiply(), mattyCalculator.getResult() should return 50");
		// if (result != 50){
		// 	throw new RuntimeException("Error!!! the result should be 50!!! Instead is: " + result);
		// } else {
		// 	System.out.println("Test OK!");
		// }

		// mattyCalculator.divide();
		// result = mattyCalculator.getResult();

		// //test the expected result
		// System.out.println("Testing: given x=10 and y=5, when call mattyCalculator.divide(), mattyCalculator.getResult() should return 2");
		// if (result != 2){
		// 	throw new RuntimeException("Error!!! the result should be 2!!! Instead is: " + result);
		// } else {
		// 	System.out.println("Test OK!");
		// }
		// //END LEVEL 3

		/*
		 * LEVEL 4: interactive prompt
		 * Your objective is to ask the user the number and the operation to do.
		 * You can choose to store the operation and do it later or do it immediately.
		 * At the end you can 
		 * You can use Class MattyCalculatorUtils to ask user input, to read it and show result.
		 */

		// //START LEVEL 4
		// System.out.println("\n\n\n");
		// System.out.println("Welcome USER! Let's do some maths! :)");
		// System.out.println("\n\n");
		// System.out.println("Here the instruction:");
		// System.out.println("-  to do operation you need to insert X and Y number and after choose and operation");
		// System.out.println("-  to exit press [CTRL + C]");
		// System.out.println("\n");
		// System.out.println("Enjoy the MattyClaculator! :)");
		// System.out.println("\n\n");

		// boolean validOpetation = true;
		// while(validOpetation) {
		// 	mattyCalculator.askX();
		// 	mattyCalculator.askY();
		// 	mattyCalculator.askOperation();
		// 	mattyCalculator.showResult();
		// }
		// //END LEVEL 4

		System.out.println("MattyCalculator application ends");

		System.out.println("End PlayGroundCalculator main...");

	}

}
