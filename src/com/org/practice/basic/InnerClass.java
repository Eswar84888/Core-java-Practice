package com.org.practice.basic;

public class InnerClass {

	public void m1() {
		class Inner{
			public void m2(int x,int y) {
				System.out.println(" sum of two numbers"+ (x+y));
			}
		}
		Inner i=new Inner();
		i.m2(10, 20);
	}
	public static void main(String[] args) {
		InnerClass i=new InnerClass();
		i.m1();
	}
}
