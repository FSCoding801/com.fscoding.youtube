package com.fscoding;

public class Swap {

	
	public static void swap(int x , int y)
	{
		
		y= y+x;
		x= y-x;
		y= y-x;
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}	
	
	public static void main(String[] args) {
	
		int x =10 ;
		int y =20;
		swap(x, y);
		
	}
}
