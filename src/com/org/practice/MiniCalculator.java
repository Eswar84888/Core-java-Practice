package com.org.practice;

import java.util.Scanner;

public class MiniCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a A value");
		int a= scn.nextInt();
		System.out.println("Enter a B value");
		int b=scn.nextInt();
		 System.out.println("Enter a (+,-./,*)");
		 char c=scn.next().charAt(0);
		 int d;
		switch(c){
		case '+' : d=a+b; 
		System.out.println("add of two numbers"+ d);
		break;
		case '-' : d=a-b; 
		System.out.println("sub of two numbers"+ d);
		break;
		case '*' : d=a*b; 
		System.out.println("multi of two numbers"+ d);
		break;
		case '/' : d=a/b; 
		System.out.println("division of two numbers"+ d);
		break;
default:
		System.out.println("Enter a wrong number");	
		}

	}

}
