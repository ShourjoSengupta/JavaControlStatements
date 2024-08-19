package com.decisionMaking;
import java.util.Scanner;

public class assignment {
	public static void main(String[] args)
	{
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username");
		String userName = sc.next();
		System.out.println("Enter Password");
		int password = sc.nextInt();
		
		if(userName =="Shourjo" && password == 1234) 
			System.out.println("Login Successfull");
		else if(userName =="Shourjo" && password != 1234) 
			System.out.println("incorrect password");
		else if(userName !="Shourjo" && password == 1234) 
			System.out.println("incorrect username");
		else
			System.out.println("incorrect username and password");
	    sc.close();
	}

}
