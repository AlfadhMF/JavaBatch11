package com.syntax.class9;

public class PatternsMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {

				System.out.print(r + " ");
			}

			System.out.println();
		}

		System.out.println(" --------------------------------------------");
		
		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {

				System.out.print(c + " ");
			}

			System.out.println();
		}

		System.out.println(" --------------------------------------------");

		for (int r = 5; r >= 1; r--) { // control rows

			for (int c = 4; c >= 1; c--) { // control cols

				System.out.print(r + " ");
			}

			System.out.println();
		}

		System.out.println(" --------------------------------------------");

		for (int r = 5; r >= 1; r--) { // control rows

			for (int c = 4; c >= 1; c--) { // control cols

				System.out.print(c + " ");
			}

			System.out.println();
		}
	}

}
