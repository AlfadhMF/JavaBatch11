package com.syntax.class8;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ask user what he/she wants to buy, ask for price and to pay for an item.
 * continue asking to pay until user gets a right amount. conditions: if user
 * give extra money--> give change if user give less money--> ask how much
 * more you need.
 * 
 * The amount has to be accumulate if user add more money
 * 
 * whenever a user is done with payments, tell them"Thank you for shopping"
 * 
 * 
 */
Scanner input=new Scanner(System.in);
String item;
double price;
double money;
double remainder;
double sum=0;

System.out.println("Please enter the item you want to purchase");
item=input.next();

System.out.println("Please enter the price");
price=input.nextDouble();

do {
	
	System.out.println("Please pay for the "+item);
	money=input.nextDouble();
	
	sum+=money;
	if(sum>price) {
		double change=sum-price;
		System.out.println("Here's the change");
		
	}else if(sum<price) {
		remainder=price-sum;
		System.out.println("Please give me more "+remainder);
		
	}else {
		System.out.println("You go the right amount");
	}
	
}while(sum!=price);
System.out.println("Thank you for shopping");
{
}
}
}