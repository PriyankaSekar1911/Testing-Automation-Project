package com.TestingAutomationProject.java.day04;

public class WhileLoop {

	public static void main(String[] args) {
		// while and do while
		// while will run the code until the condition is true
		// do will run the code atleast once before it moves to while
		
		int countdown = 3;
		while (countdown >0) {
			System.out.println(countdown);
			countdown -- ;
		}
		System.out.println("Happy new year");

		//do will run the code atleast once before it moves to while
		
		int i = 10;
		do {
		System.out.println("i is "+ i);
		i--;
		}
		while (i < 5); // if the condition is false it will skip while and execute do 
		
		//Example
		int enteredpin = 1322;
		int correctPin = 1111;
		int attempt = 1;
		do {
			System.out.println("Checking the pin...");
			attempt ++;
		}
		while (enteredpin != correctPin && attempt<=3);
		System.out.println("Access denied...");
		
		
		int EP = 1111;
		int CP = 1111;
		int atmpt = 1;
		do {
			if (EP == CP) {
				System.out.println("EP IP Check the below options "); // EP IP is for referring 2nd prblm
		}else
		{
			System.out.println(" EP IP Access denied...");
		}
			atmpt ++;
			break;// if break is not there it will give 4 times,, 1 for  do and 3 from while
		}
		while (atmpt <=3);
		
	}
}
