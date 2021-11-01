package com.syntax.class5;

import java.util.Scanner;

public class LogicalOrDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ask user to enter today's day
		 * if monday or friday-->no class
		 * tuesday or wednesday--> manual class
		 * saturday or sunday--> java class
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		String day=scan.next();
		
		if(day.equals("monday")||day.equals("friday")) {
			
			System.out.println("No class today.");
			
		}else if(day.equals("tuesday")|| day.equals("wednesday")) {
			
			System.out.println("manual class today.");
			
		}else if(day.equals("saturday")||day.equals("sunday")) {
			
			System.out.println("java class today.");
		}else if(day.equals("Thuresday")||day.equals("friday")) {
			System.out.println("Review class");
		}else {
			System.out.println("wrong input");
		}

	}

}
