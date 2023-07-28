package com.org.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0,1,1,2,3,5,8,13
		int a=0; int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
