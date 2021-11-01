package com.syntax.class4;

import java.util.Scanner;

//shortcut to import existing class to the current class
public class ScannerDemo {
//mac: cmd+shift+o
//windows: ctrl+shift+o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String str="Abc";
str="zyx";

Scanner scan=new Scanner(System.in);
System.out.println("please enter your name");


String name=scan.next();// it will capture String value from console

System.out.println("hello "+name);

System.out.println("please enter your age");
int age=scan.nextInt();

System.out.println(name+" you are "+age+" years old");

	}

}
