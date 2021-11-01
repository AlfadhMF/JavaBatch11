package com.replit.homework;

public class ArithmeticOperations12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. add num1 and num2
 * 2. divide the result by num3
 * 3. subtract num4 from that result
 * Output: The result of arithmetic operations is equal to___.
 */
		
		int num1=3;
		int num2=7;
		int num3=5;
		int num4=1;
		
		
		long number1=num1+num2;
		long number2=number1/num3;
		long number3=num4%number2; //Subtract means %
		
		
		System.out.println("The result of arithmetic operations is equal to "+number3);
	}

}
