package com.org.practice;

import java.util.Scanner;

public class CelToFar {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	float cel, far;
	System.out.println("Enter a cel");
	cel=scn.nextFloat();
	far=(float) ((cel*1.8)+32);
	System.out.println(far);
}
}
