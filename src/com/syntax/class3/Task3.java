package com.syntax.class3;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8.
		 * Your program should say. " the perimeter of a rectangle with width ___ and height ___ is equal to ___ and the area is___"
		 */
		
		double width=5;
		double height=8;
		double perimeter= 2*(width+height);
		double area=width*height;
		
		System.out.println(" The preimeter of a rectangle with width "+width+ " and height " +height+ " is equal to " +perimeter+ " and the area is " +area);
		System.out.println(" The preimeter of a rectangle with width "+width+ " and height " +height+ " is equal to " +(2*(width+height))+ " and the area is " +(width*height));
		

	}

}
