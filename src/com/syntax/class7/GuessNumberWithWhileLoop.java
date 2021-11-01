package com.syntax.class7;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		System.out.println("Please guess my secret number. It is a number from 1 to 100");
		userNumber=scan.nextInt();
		while(userNumber!=secretNumber) {
			
			System.out.println("Please guess my secret numbber from 1 to 100");
			userNumber=scan.nextInt();
		}
		System.out.println("YOU GOT IT!!!");
	}
/*
 * print number from 30 to 70 using do while loop
 * print odd numbers from 99 to 1 using do while
 * 
 */
	

	
}
