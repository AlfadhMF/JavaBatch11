package com.syntax.class6;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Print even number from 20 to 100
		int i =20;
		while(i<=100) {
System.out.print(i+" ");
			i+=2;
		}
		System.out.println("  ANOTHER WAY ");
		int c = 20;
		while (c<=100) {
			if (c%2==0) {
				System.out.print(c+" ");
				c++;
			}
		}
		System.out.println("____ End of the code______");
	}

}
