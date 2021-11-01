package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* We need to capture a country from a user
 * based on the country we have to define a favorite food
 * 
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a country");
		String count= scan.next();
		String food=null;
		
		switch(count) {
		case "IKraine":
			food="Borsh";
			break;
		case"USA":
			food="burger";
			break;
		case"Mexico":
			food="Tacos";
			break;
			default:
				food="Unknown";
		}
		if(!food.equals("Unknown")) {
			System.out.println("If your country is "+ count +(" your favorite food is ")+ food);
		}else {
			System.out.println("Please try another country");
		}
	}

}
