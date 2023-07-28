package com.org.practice;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		
System.out.println("Enter character");
char ch=scn.next().charAt(0);

if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {
	System.out.println(" given number is a charcter");
	
}else {
	System.out.println(" given number is not a charcter");
}
	}

}
