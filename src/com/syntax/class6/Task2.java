package com.syntax.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user to enter their country and capture it.
 *Once values are captured print which language user speaks.
 * 
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a country");
		String country= scan.next();
		String language=null;
		switch(country) {
		case "IKraine":
			language="Ukrainian";
			break;
		case"USA":
			language="English";
			break;
		case"Mexico":
			language="Spanish";
			break;
			default:
				language="Unknown";
		}
		if(!language.equals("Unknown")) {
			System.out.println("If your country is "+ country +(" the language you speaking is ")+ language);
		}else {
			System.out.println("Please try another country");
		}
	}

}
