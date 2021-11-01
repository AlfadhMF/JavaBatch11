package com.syntax.class4;

public class NestedIMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean replCompleted=true;
		int assignment=19;
		if(replCompleted) {
			System.out.println("Great job!");
			if(assignment>16) {
				System.out.println("You did an amazing work!");
			}else if(assignment>10) {
				System.out.println("You did good, but you should do more");
			}else if(assignment>6) {
				System.out.println("You need to try do more HomeWork");
			}
		}else {
			System.out.println("Please make sure you do homework");
			
		}
	}

}
