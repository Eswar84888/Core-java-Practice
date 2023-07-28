package com.org.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scn=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=scn.nextInt();
 int sum=0;
 for(int i=1;i<n;i++) {
	 if(n%i==0) {
		sum+=i;
	 }
 }
 if(sum==n) {
	 System.out.println(" it is perfect number");
 }else {
	 System.out.println("not a perfect number");
 }
	}

}
