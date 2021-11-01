package com.syntax.class2;

public class HomeWorkClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Write a java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say "the___ of 2 numbers ___ and ___ is equal to ___"
		 */
		        double number1=20.3;
				double number2=10.3;
				double sum=number1+number2;
				double subtract=number1-number2;
				double multiply=number1*number2;
				double divide=number1/number2;
				
				System.out.println(" The sum of two numbers " +number1+ " and " +number2+ " = " +sum );
				System.out.println(" the subtracttion of two number " +number1+ " and " +number2+ " = " +subtract) ;
				System.out.println(" the multiplication of two numbers " +number1+ " and " +number2+ " = " +multiply );
				System.out.println(" divistion of two numbers " +number1+ " and " +number2+ " = " +divide );
				
				/*Write a program to find the squre of the number 3.9. you program should say
				 * "the square of the ___ is ___"
				 */
				
				double number=3.9;
				double square=number*number;
				System.out.println("*****************************************************************");
				System.out.println("*****************************************************************");
				System.out.println(square);
				
				/*Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8.
				 * Your program should say. " the perimeter of a rectangle with width ___ and height ___ is equal to ___ and the area is___"
				 */
				
				int width=5;
				int height=8;
				int area= width * height;
				
				System.out.println(" The preimeter of a retangle with wide " +width+ " and height " +height+ " = " +area );
				System.out.println("**********************************************************************");
				
				/*Declare variable and increase by 100 using shorthand operator.
				 * Declare variable and decrease by 67 using shorthand operator.
				 * Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator each person should get an equal piece of cake.
				 * Declare variable cakePiece=25 and divide cakePiece between7 people.
				 * Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people.
				 * 
				 * 
				 */
				
				int number3 = 10;
				number3 += 100;
				System.out.println(number3);
				System.out.println("************************************************");
				
				int number4 = 120;
				number4 -= 67;
				System.out.println(number4);
				System.out.println("************************************************");
				
				double cakepices = 11;
				cakepices /= 4;
				System.out.println(cakepices);
				System.out.println("*************************************************");
				
				int cakepices2 = 25;
				cakepices2 %= 7;
				System.out.println(cakepices2);
				
				
				
				
	}

}
