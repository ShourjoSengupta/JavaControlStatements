package com.loopStatements;

public class ForEachLoop {
public static void main(String[] args) {
	String[] names = {"Java","C","C++","Python","Javascipt"};
	System.out.println("Printing content of the array names: ");
	
	for(String s: names) {
		System.out.println(s);
	}
}
}
