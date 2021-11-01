package com.syntax.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Prompt the user to enter person heights in inches.
 *Person should be classified as one of the following:
 short (under 60 inch)
 medium(between 60 -72 inch)
 tall (over 72 inch)

Write a program that will print whether it is a weekend or weekday.
 If any day from 1-5 → output “It is a weekday”,
  anyday from 6-7 → output “It is a weekend”,
   any other day → output “Invalid day”
 * 
 * 
 */
		
Scanner in=new Scanner(System.in);
System.out.println("what's Your hight?");
 int number=in.nextInt();
if(number>1&&number<60) {
	System.out.println(" this "+number+" is for Short hight");
}else if(number>=61&&number<=72) {
System.out.println(" this "+number+" is for medium hight");
	}else if(number>=73) {
		System.out.println(" this "+number+" is for tall hight");
	}
	}
}
