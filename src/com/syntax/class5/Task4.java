package com.syntax.class5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program for user to enter his/hers birth month.
		 *  Based on the month define the season.
		 *  Example: if user is born in June, July or August → season =“Summer”.
		 * At the end of the program we should see output as “You were born is season ______“.
		 * 
		 * 
		 * 
		 */
Scanner in=new Scanner(System.in);
System.out.println("Please enter your month");
String month=in.next();
if(month.equals("Janury")||month.equals("December")) {
	System.out.println("You were born is season is Winter");
}else if(month.equals("Feburary")|| month.equals("March")) {
	System.out.println("You were born this season is Spring");
}else if(month.equals("April")|| month.equals("may")||month.equals("June")) {
	System.out.println("You were born is season is Summer");
}else if (month.equals("July")|| month.equals("Augest")|| month.equals("September")||month.equals("Mid-September")) {
	System.out.println("You were born is season is Monsoon");
}else if(month.equals("September-End")||month.equals("November")) {
	System.out.println("You were born is season is Autumn");
}else {
}


}
}