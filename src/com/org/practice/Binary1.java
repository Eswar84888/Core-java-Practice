package com.org.practice;

import java.util.Scanner;

public class Binary1 {
public static void main(String[] args) {

	
	long binaryOne, binaryTwo;
    int remOne, remTwo, sumDigit, i=0, carry=0;
    int[] sum = new int[10];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the First Binary Number: ");
    binaryOne = scan.nextLong();
    System.out.print("Enter the Second Binary Number: ");
    binaryTwo = scan.nextLong();
    
    while(binaryOne!=0 || binaryTwo!=0)
    {
       remOne = (int)(binaryOne%10);
       System.out.println("remone "+remOne);
       remTwo = (int)(binaryTwo%10);
       System.out.println("remTwo "+remTwo);
       sumDigit = remOne + remTwo + carry;
       System.out.println("sumDigit "+sumDigit);
       sum[i] = (int)(sumDigit%2);
       System.out.println("  sum[i]"+  sum[i]);
       carry = (int)(sumDigit/2);
       System.out.println("  carry"+  carry);
       binaryOne = binaryOne/10;
       binaryTwo = binaryTwo/10;
       i++;
    }
    if(carry==1)
       sum[i] = carry;
    System.out.print("\nResult = ");
    while(i>=0)
    {
       System.out.print(sum[i]);
       i--;
    }
	
}
}
