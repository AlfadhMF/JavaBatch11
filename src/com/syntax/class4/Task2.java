package com.syntax.class4;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2.Create a java program that will ask user to 
		 * input city and temperature. you program
		 * should convert fahrenheit  into celsius and
		 * print "The temperature is the city__is__"
		 */
				Scanner input=new Scanner(System.in);
				System.out.println("What city do you live");
				String city=input.next();
				
				System.out.println("What is the temperature in your city?");
				int Fahrenheit=input.nextInt();
				int Celsius=((Fahrenheit-32)*5)/9;
				System.out.println("the temperature is the city "+city+" is "+Celsius+" C. ");
	}

}
