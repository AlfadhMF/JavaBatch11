package com.replit.homework;

import java.util.Scanner;

public class ScannerClass21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that asks the user's age: "Enter your age "
 * Then display it by adding 10 (i.e age + 10) in your final output.
 * Example Output:
 * Enter your age 30, Your age after 10 years is 40
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		String age=scan.next();
		int number1=10;
		int number2=30;
		int number3=number1+number2;
		System.out.println("Your age after "+number1+" years is "+number3);

}
}