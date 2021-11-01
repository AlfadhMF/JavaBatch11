package com.syntax.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program that will print whether it is
		 * a weekend or weekday. If any day from 1-5 → output 
		 * “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “
		 * Invalid day”
		 */
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter sny day from 1-7");
		String day=Scan.next();
		if(day.equals("1")||day.equals("2")||day.equals("3")||day.equals("4")||day.equals("5")) {
			System.out.println(day+" is consider weekday");
		}else if(day.equals("6")||day.equals("7")) {
			System.out.println(day+" is consider weekend");
		}else {
			System.out.println("Invalid day");
			
		}
		
}
}