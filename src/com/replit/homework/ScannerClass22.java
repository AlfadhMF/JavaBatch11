package com.replit.homework;

import java.util.Scanner;

public class ScannerClass22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program to take user name, age and mobile number
 * First Output: "Enter your name"
 * Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
 * Third Output: "Enter your age"
 * 
 * Example Output:
 * 
 * Enter your name, Enter your mobile number, Enter your age
 * 
 * ""Your name is Weqas, your age is 45 and your mobile number is 123-456-7890""
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		System.out.println("Enter your mobile number");
		String mobile=scan.next();
		System.out.println("Enter your age");
		String age=scan.next();
		System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobile);
	}

}
