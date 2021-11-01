package com.syntax.class3ifcondition;

public class HomeWorkClass3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Create a java program and name it double comparison.
 * Declare 2 double values and if value of first variable is higher then the second, print.
 * "Double value__ is larger than__" Otherwise print...
 */
		double number1=20;
		double number2=15;
		if(number1>number2)
		System.out.println("Double value " +number1+ " is larger than " +number2);
		System.out.println("************************************************************");
		
		
		/*Create a java  program and name it temperature Check.
		 * Create variable to store temperature.
		 * Your program should check if temperature is below 32 then it should print.
		 * "Water will freeze with temperature__", otherwise water will NOT freeze with temperature__".
		 */

		
		long TemCheck1=32;
		long StoreTemperature=23;
		long Belowtem=TemCheck1-StoreTemperature;
		if(TemCheck1>StoreTemperature);
		System.out.println("Water will freeze with temperature " +Belowtem+ " , otherwise water will NOT freeze with temperature " +TemCheck1);
		System.out.println("************************************************************");
		
	}

}
