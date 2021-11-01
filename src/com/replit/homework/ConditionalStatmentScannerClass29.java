package com.replit.homework;

import java.util.Scanner;

public class ConditionalStatmentScannerClass29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a java program that prints out true if ( x y ) returns a positive value.
		 *Else prints out false if (x y) returns a negative value.
		 * 
		 * Step 1: Your program should ask "Please enter first number" - for the 1st number and
		 * "Please enter second number" - for the 2nd number.
		 * Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
		 *  
		 *  If the result of a multiplication is positive print true, otherwise print false.
		 *  
		 *  Example Output:
		 *  Please enter first number
		 *  Please enter second number
		 *  true
		 *  
		 *  Example Output:
		 *  Please enter first number
		 *  Please enter second number
		 * false 
		 *  
		 *  
		 *  
		 */
		Scanner Inp=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=Inp.nextInt();
		System.out.println("Please enter second number");
		int number2=Inp.nextInt();
		if(number1==number2){
		  System.out.println("true");
		}else{
		  System.out.println("false");
		}
	}

}
