package com.syntax.class7;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Lets create a secret number (1 to 100)
 * 
 * Lets ask user to guess my secret number
 * 
 * Keep asking for a number till user guess the secret number
 */
		
		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		do {
			System.out.println("Please guess my secret number. It is a number from 1 to 100");
			 userNumber=scan.nextInt();
		}while(userNumber!=secretNumber);
		
		System.out.println("You got it!!!!!");
	}

}
