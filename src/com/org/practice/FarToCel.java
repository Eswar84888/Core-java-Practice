package com.org.practice;

import java.util.Scanner;

public class FarToCel {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter  far value");
	float far=scn.nextFloat();
	float cel;
	cel=(float) ((far-32)/1.8);
	System.out.println(cel);
	}
}
