package com.loopStatements;

public class forLoopExample {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		for(int i=0, j=0;i<10;i++,j--) {
			System.out.println(j);
		}
		
		int[] numbers = {1,2,3,4,5};
		for(int n : numbers) {
			System.out.println(n);
		}
		
		for(;;)
			System.out.println("I will loop 4ever....");
		
		
		

	}

}
