package com.syntax.class4;
import java.util.Scanner;
public class Task4 {
	
public static void main(String[] args) {
	/*4. Create a java program that will ask if user has a 
	 * credit card or not. if you user does not have a 
	 * credit card then offer them.if they do have one
	 * ask what is balance on the card? if balance of 
	 * the card is larger than 1000, tell them to pay
	 * off immediately, otherwise you can tell them
	 * that they can spend more.
	 */
	Scanner input = new Scanner(System.in);
	System.out.println("Do you have a credit card");
	boolean creditCard = input.nextBoolean();
	
	if(creditCard==true) {
		System.out.println("What is Balance on the credit card?");
		double balance = input.nextDouble();
		
		if(balance > 1000) {
			System.out.println("pay off immediately");
		}else {
			System.out.println("You can spend more");
		}
	}else {
		System.out.println("Please open a credit card");
	}
	
}
}