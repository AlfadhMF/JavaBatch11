package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object of Dog class
          Dog alonasDog= new Dog();
          alonasDog.name="Lexy";
          alonasDog.breed="american hound";
          alonasDog.colors="Black";
          alonasDog.age=10;
          alonasDog.gender='M';
          alonasDog.height=2.5;
          
          
          System.out.println("My Dog name is "+alonasDog.name);
          System.out.println("His breed is "+alonasDog.breed);
          System.out.println("His color is "+alonasDog.colors);
          System.out.println("His hight is "+alonasDog.height);
          
          Dog jimmaysDog= new Dog();
          jimmaysDog.name="Teddy";
          jimmaysDog.breed="Labrador Retriever";
          jimmaysDog.colors="Golden";
          jimmaysDog.height=5;
          jimmaysDog.age=12;
          jimmaysDog.gender='M';
          
          System.out.println("My Dog name is "+jimmaysDog.name);
          System.out.println("His breed is "+jimmaysDog.breed);
          System.out.println("His color is "+jimmaysDog.colors);
          System.out.println("His hight is "+jimmaysDog.height);
          
          
          Dog arwasDog=new Dog();
          arwasDog.name="manroe";
          System.out.println("Arwas Dog is "+arwasDog.name);

	}

}
