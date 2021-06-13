package com.fscoding;

public class Pattern2 {

	void pattern2(int size) {

		for (int i = 1; i <= size; i++) {

			// for space
			for (int j = size - i; j >= 1; j--) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			
			System.out.println();
		}

	}

	void daimondPattern(int size) {

		for (int i = 1; i <= size; i++) {

			// for space
			for (int j = size - i; j >= 1; j--) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1; i <= size; i++) {

			// for space
			for (int j = size - i; j < size; j++) {

				System.out.print(" ");
			}

			for (int j = i; j < size; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		Pattern2 pattern2 = new Pattern2();
//		pattern2.pattern2(5);
		pattern2.daimondPattern(5);
	}
}
