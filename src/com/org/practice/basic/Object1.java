package com.org.practice.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l=new ArrayList<>();
l.add("Z");
l.add("A");
l.add("M");
l.add("D");
l.add("a");
System.out.println("List of values "+l);
Collections.sort(l);
System.out.println("List of values "+l);
System.out.println(Collections.binarySearch(l, "Z"));
System.out.println(Collections.binarySearch(l, "o"));
	}

}
