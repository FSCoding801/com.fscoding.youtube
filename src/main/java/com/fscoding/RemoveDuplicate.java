package com.fscoding;

public class RemoveDuplicate {

	public static int[] removeDuplicateFromArray(int arr[]) {

		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {

			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + "\t");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 100 };
		removeDuplicateFromArray(arr);
	}
}
