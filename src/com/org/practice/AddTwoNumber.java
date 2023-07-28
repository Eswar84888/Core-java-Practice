package com.org.practice;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int a=sc.nextInt();
       System.out.println("Enter a number");
       int b=sc.nextInt();
       System.out.println("Enter b number");
       System.out.println("Addition of numbers");
      int c;
      c=a+b;
      System.out.println("addition of two numbers: " +a+" ,"+b+"="+c );
	}

}
