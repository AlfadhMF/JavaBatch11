package com.syntax.class7;

public class ForLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
for(int i=1;    i<=5;    i++) {
	
	
	
	System.out.println("Hello");
}
System.out.println("----- print numbers from 1 to 20---");

for(int i=1;  i<=20;  i++) {
	System.out.println(i+" ");
}
System.out.println("----- print numbers from 100 to 20---");

for(int i=100;  i>=20;  i--) {
	System.out.print(i+" ");
}
System.out.println();
System.out.println("--- print EVEN numbers from 1 to 50 ---");
for(int i=1;  i<=50;  i++) {
	if(i%2==0) {
		System.out.print(i+" ");
	}
}
System.out.println();
System.out.println("--- print EVEN numbers from 1 to 50 ---");

for(int i=2;i<=50;i+=2) {
	System.out.print(i+" ");
}
System.out.println();
System.out.println("--- what is the output???---");
for(int i=1;i<=20;i+=5) {
	System.out.println(i+"  ");
}
	}

}
