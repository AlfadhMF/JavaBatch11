package com.syntax.class4;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program to ask user to enter numbers 
 * of worked years and annaul salary. if user
 * worked for more or equals to 5 years than user
 * is eligible for the bonus, otherwise he is not.
 * once user is eligible and salary is larger than
 * 50000 than bonus = 5000, otherwise bonus=3000. * 
 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please, enter your worked years");
		int workYears = input.nextInt();
		
		System.out.println("Please, enter your annul salary");
		int annualSalary=input.nextInt();
		
		if(workYears >=5) {
			System.out.println("you are eligible for the bonus!");
			if(annualSalary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("Unfortunately, you are not eligible for the bonus");
		}
	}

}
