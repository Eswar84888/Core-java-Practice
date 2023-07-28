package com.org.practice.basic;

public class Engine {
 public int start() {
	 return 1;
	 
 }
}
// inheritance concept
 class Car extends Engine{
	 public void drive() {
		 int status=-start();
		 if(status==1) {
			 System.out.println("Engine starts");
		 }else {
			 System.out.println("Engine nort start");
		 }
	 }
 }
 
 
 
 
 
//	 
// ?
//class Car extends Engine{
//public void drive() {
//	Engine e=new Engine();
//	int status=start();
//	 if(status==1) {
//		 System.out.println("Engine starts");
//	 }else {
//		 System.out.println("Engine nort start");
//	 }
//} 
 

