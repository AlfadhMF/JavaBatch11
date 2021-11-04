package com.syntax.class8;

public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *nested loop --> loops inside another loop 
 * 
 */
		for(int i=1; i<=3;i++) {// outer loop
			
			for(int j=1; j>=4; j++) {//inner loop
				
				System.out.println(i+" "+j);
			}
		}
		System.out.println("_______ Car Odometer_________");
		for (int a=1; a<=9; a++) {
			for (int b=1; b<=9; b++) {
				for (int c=1; c<=9; c++) {
					for (int d=1; d<=9; d++) {
						
						System.out.println(a+""+b+""+c+""+d);
					}
				}
			}
		}
		
		System.out.println("______MULTIPLICATION TABLE____________");
		
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("___________");
		}
	}

}
