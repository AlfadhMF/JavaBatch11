package com.replit.homework;

import java.util.Scanner;

public class NestedIfScannerClass31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Is it sunny outside?");
		 Scanner scanner=new Scanner(System.in);
		 boolean isSunny=scanner.nextBoolean();
		 int temperature;
		 
		 if(isSunny){
		   System.out.println("It is a sunny day, I should go somewhere!");
		   System.out.println("What is the temperature outside?");
		   temperature=scanner.nextInt();
		   if(temperature>85){
		     System.out.println("I am going to the beach");
		   }else{
		    System.out.println("I am going to the park"); 
		   }
		 }else{
		   System.out.println("I stay home and practice Java");
		 }
	}

}
