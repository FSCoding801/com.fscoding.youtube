package com.fscoding;

public class StartParttern {

	void parttern(int size) {

		// for each row
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <=size; j++) {
				System.out.print("*i-"+i+" j-"+j+"\t");
			}
			
				
			System.out.println();
		}

	}

	public static void main(String[] args) {

		StartParttern start = new StartParttern();
		start.parttern(5);

	}
}
