package com.syntax.class4;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*3. Create a java program to capture 2 number from a user
 * and define with number is the largest.
 */
	Scanner input=new Scanner(System.in);
	System.out.println("Please neter your number");
	int number1=input.nextInt();
	System.out.println("Please, enter second number");
	int number2=input.nextInt();
	
	if(number1>number2) {
		System.out.println("The First number larger than second one");
	}else {
		System.out.println("The Second number is larger than first one");
	}
	
	}

}
