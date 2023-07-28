package com.org.practice;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn= new Scanner(System.in);

System.out.println("Enter a number");
int n=scn.nextInt();
int count=0;
//while(n>0) {
//	count++;
//	n=n/10;
//	
//}
for(count=0; n!=0; n=n/10) {

count++;
	}
System.out.println("\nThe Total Number of Digits = " +count);
	}
}
