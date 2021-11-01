package com.syntax.class5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that will read three inputs of scores
 * (quiz, mid term, and final scores)
 * and determine the grade based on the following rules: 
 * if the average score >=90 → grade=A
 * if the average score >= 70 and <90 → grade=B
 * if the average score>=50 and <70 → grade=C
 * if the average score<50 → grade=F
 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your score");
		int score=in.nextInt();
		if(score>90&&score<100) {
			System.out.println(score+" =A");
		}else if(score>=70&&score<=90) {
			System.out.println(score+" =B");
		}else if(score>=50&&score<70) {
			System.out.println(score+" =C");
		}else if(score<50&&score>0) {
			System.out.println(score+" =F");
		}else {
			System.out.println("END");
		}
		
}
}