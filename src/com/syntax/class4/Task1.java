package com.syntax.class4;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*1. you are a loan specialist and you need to ask
 * user what is the amount of loanis needed. if
 * loaan is less or equal to 200,000 then you would
 * lend the money otherwise you would reject the
 * client
 */
		
Scanner input = new Scanner(System.in);
System.out.println("What is the amount of loan you need?");

double loan = input.nextDouble();

if(loan < 200000) {
	System.out.println("We will be able to lend you money");
}else {
	System.out.println("we can't lend to you");

}
	}

}
