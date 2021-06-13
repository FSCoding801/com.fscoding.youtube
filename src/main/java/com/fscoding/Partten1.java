package com.fscoding;

public class Partten1 {

	void partten1(int size) {

		// for each row
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= i; j++) {
//				System.out.print("*- i="+i+" J="+j+"\t");	
				System.out.print("*");

			}
			System.out.println("");

		}

	}

	void partten2(int size) {

		for (int i = 0; i < size; i++) {

			
		}

	}

	public static void main(String[] args) {
		Partten1 partten1 = new Partten1();
		partten1.partten1(5);

	}

}
