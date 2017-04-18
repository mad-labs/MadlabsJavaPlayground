package it.madlabs.playground;

import it.madlabs.playground.calculator.MattyCalculator;
import java.io.IOException;
import java.lang.RuntimeException;

/**
 * Created by gabriele on 10/04/17.
 */
public class PlayGroundCalculator {

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
		System.out.println("## Starting PlayGroundCalculator main... ## ");
		
		System.out.println("## Creating new instance on MattyCalculator application ##");
		MattyCalculator mattyCalculator = new MattyCalculator();

		/*
		 * LEVEL 1: start our application
		 * Your objective is to create a method in MattyCalculator.java to start our application
		 */

		//START LEVEL 1
		System.out.println("## Starting MattyCalculator application ##");
		mattyCalculator.start();
		//END LEVEL 1



		/*
		 * LEVEL 2: getting a result
		 * Your objective is to create a method in MattyCalculator.java to obtain result of calculation.
		 * You will need a field in the MattyCalculator.java to store result of calculation. Initialize it
		 * with 0
		 */

		//START LEVEL 2
		System.out.println("## Testing initialization. mattyCalculator.getResult() should return 0 ##");
		double result = mattyCalculator.getResult();

		//test the expected result
		if (result != 0){
			throw new RuntimeException("Error!!! the result should be 0!!!");
		}
		//END LEVEL 1

		System.out.println("## MattyCalculator application ends ##");

		System.out.println("## End PlayGroundCalculator main... ##");
	}

}
