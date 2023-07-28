package com.org.practice;

import java.util.Scanner;

public class PrimeNumer {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter a staring number");
		int a = scn.nextInt();
		System.out.println(" Enter a staring number");
		int b = scn.nextInt();
		
		for(int i=2; i<=b;i++) {
			
			int count=0;
			for(int j=2;j<i;j++) {
				
			if(i%j==0) {
				 count++;
				 break;
			}
			}
			if(count==0) {
				System.out.print(i+",");
			}
		}
		
			
		}
		
		
	}


