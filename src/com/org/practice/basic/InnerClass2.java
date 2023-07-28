package com.org.practice.basic;

public class InnerClass2 {
class Inner{
	public void m1(int x,int y) {
		System.out.println("inner class"+ (x+y));
	}
}
public void m2() {
	Inner i=new Inner();
	i.m1(20,20);
}
public static void main(String[] args) {
	InnerClass2 i2=new InnerClass2();
	i2.m2();
}
}
