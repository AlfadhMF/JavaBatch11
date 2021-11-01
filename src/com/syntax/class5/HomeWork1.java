package com.syntax.class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a java program that will ask if user has a credit card or not.
 * if you user does not have credit card then offer them.
 * if they do have one ask what is balance on the card?
 * if balance
 * 
 */
		
		Scanner input = new Scanner(System.in);
				
				System.out.println("Do you have a credit card?");
		
		boolean condition=input.nextBoolean();
		
		if (condition.equlsIgnoreCase("yes")) {
			
			System.out.println("what isthe balance on your credit card?");
			double balance = input.nextDouble();
			
			if (balance<1000) {
				
				System.out.println("pay it off immediately");
				
			}else {
				
				System.out.println("you need to spend more");
			}
			
			}else {
				
				System.out.println("Would you like to get a credit card?");
				
			
			}
		
	{			
	}

}
