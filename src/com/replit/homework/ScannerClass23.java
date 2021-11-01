package com.replit.homework;

import java.util.Scanner;

public class ScannerClass23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Create a program that will ask a user to input boolean value "Input the boolean value"
 * If the input is true or false, then the output should look like below:
 * Example Output:
 * Input the boolean value
 * The value is true
 * Example Output:
 * Input the boolean value
 * The value is false
 */
		Scanner scan=new Scanner(System.in);
		boolean InFalse=false;
		System.out.println("Input the boolean value");
		String value1=scan.next();
		System.out.println("The value is "+value1);
		
}
}