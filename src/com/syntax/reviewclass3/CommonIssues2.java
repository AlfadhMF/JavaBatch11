package com.syntax.reviewclass3;

public class CommonIssues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float f=5.333333333333f;
double g=5.33333333333333333333;
if(f==5.3) {
	System.out.println("true");
}else {
	System.out.println("false");
}
System.out.println(f);
System.out.println(g);

//Best practice for decimal numbers always use double
//for non decimal numbers always use float
	}

}
