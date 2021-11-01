package com.syntax.class5;

import java.util.Scanner;

public class LogicalAndDemo {

	public static void main(String[] args) {

		/*
		 * Ask a user to enter a number
		 * based on the entered # we will define if number is small, medium, or large
		 * 
		 * if number is between 1 and 10-->small
		 * if number is between 11 amd 100-->medium
		 * if number is between 101 and 1000-->xlarge 
		 */

		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=in.nextInt();
		if(number>1&&number<10) {
			System.out.println(number+"is small");
		}else if(number>=11&&number<=100){
			System.out.println(number+"is medium");
		}else if(number>=101&&number<=1000) {
			System.out.println(number+"is large");
		}else if(number>=1001) {
			System.out.println(number+"is xlarge");
		}
}
}