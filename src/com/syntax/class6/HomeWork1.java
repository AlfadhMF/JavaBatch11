package com.syntax.class6;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Using scanner class create calculator.
 * Allow user to enter 2 numbers and operator(+,-,*,/).
 * Based on operator provide the result to user.   
 * Please complete this assignment in 2 ways: using if statement and switch case.
 */
	Scanner opSwitvh= new Scanner(System.in);
	System.out.println("Please enter number 1");
	int a = opSwitch.nextInt();
	System.out.println("Please enter number 2");
	int b = opSwitch.nextInt();
	System.out.println("Please enter your operator");
	char op = opSwitch.next().charAt(0);
	int solve=0;
	switch(op) {
	case '*':
		solve=a*b;
		break;
	case'/':
		solve=a/b;
		break;
	case'+':
		solve=a+b;
		break;
	case'-':
		solve=a-b;
		break;
		default:
			System.out.println("Entry is invauild");
	}

}
}