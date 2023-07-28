package com.org.practice;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a charcter");
       char vowel= scn.next().charAt(0);
//       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//    	   System.out.println("vowel");
//       }
//       else {
//    	   System.out.println("not a vowel");
//       }
		
		char ch[]={'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==vowel) {
				count++;
				break;
			}
		}
			if(count!=0) {
				System.out.println("given number is vowel");
			}else {
				 System.out.println("not a vowel");
			}
		
       
	}

}
