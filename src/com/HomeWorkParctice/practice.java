package com.HomeWorkParctice;

import java.util.Scanner;

public class practice {
public static void main(String [] args) {
	
	Scanner console = new Scanner(System.in);
	System.out.print("How many brothers? ");
	int brothers = console.nextInt();
	System.out.print("How many sisters? ");
	int sisters = console.nextInt();
	if (brothers + sisters == 0) {
	  System.out.println("You're an only child.");
	}
	
}
}