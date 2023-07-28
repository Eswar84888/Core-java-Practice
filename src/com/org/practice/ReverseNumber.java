package com.org.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=scn.nextInt();
		int org=num;
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(org==rev)
	         System.out.println("\nYes, the number is equal to its reverse.");
	      else
	         System.out.println("\nNo, the number is not equal to its reverse.");
		System.out.println(rev);
	   }
		
	}


