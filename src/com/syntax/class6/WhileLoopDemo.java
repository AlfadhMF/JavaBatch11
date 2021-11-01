package com.syntax.class6;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I want ro print EVEN number from 1 to 10");
int i=2;
while(i<=10) {
	System.out.print(i+" ");
	i+=2;
}
System.out.println("I am outside of the while loop");
System.out.println(i);

System.out.println("_________ ANOTHER WAY_________");
int a=1;
while(a<=10) {
	if (a%2==0) {
		System.out.println(a);
	}
	a++;
}
	}

}
