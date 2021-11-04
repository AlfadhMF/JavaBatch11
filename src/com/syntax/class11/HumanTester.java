package com.syntax.class11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Mohanad=new Human();
		Mohanad.name="Mohanad";
		Mohanad.age=23;
		Mohanad.height=5.11;
		Mohanad.weight=170;
		Mohanad.bloodType="A+";
		
		Mohanad.eat();
		Mohanad.sleep();
		Mohanad.walk();
		System.out.println("________________________________");
		Human Mohammad=new Human();
		Mohammad.name="Mohammad";
		Mohammad.age=28;
		Mohammad.height=5.10;
		Mohammad.weight=200;
		Mohammad.gender='M';
		Mohammad.bloodType="A+";
		Mohammad.eat();
		Mohammad.sleep();
		Mohammad.walk();
		Mohammad.sendMemes();
		System.out.println(Mohammad.age);
		
		Scanner scanner=new Scanner(System.in);
	}

}
