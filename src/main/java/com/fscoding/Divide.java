package com.fscoding;

public class Divide {
	
	public static void  divideWithout(int dividend , int divisor) {
		
		int count=0;
		while(dividend>=divisor)
		{
			dividend-=divisor;
			count++;
		}
		

		System.out.println("Result is =:"+count);
	}
	
	public static void main(String[] args) {
		
		int x = 100;
		int y= 20;
		divideWithout(x, y);
	}

}
