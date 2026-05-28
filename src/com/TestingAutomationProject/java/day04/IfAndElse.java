package com.TestingAutomationProject.java.day04;

public class IfAndElse {

	public static void main(String[] args) {
		// if, if else, elseif, short hand else if,nester if, logical iff
		
		// when condition one is true we use if
		
		int A =15;
		int B =32;
		if (A<B)
		System.out.println("A is smaller than B");
		System.out.println("I\'m learning Java");
		// Here I tried without curly braces and the immediate next statement will be considered.
		// So I'm learning java also printed as sys doesn't consider this as if statement..
		
		if (A>B) {
			System.out.println("A is larger than B");// this will not displayed only the below as if statement is false.
			}
			System.out.println("I\'m learning Java");
			
			
		// if condition is false and we need some output defining its  false
		int C =15;
		int D =32;
		if (D>C)
		{
		System.out.println("D is greater than C");
		}
		else {
			System.out.println("D is smaller than C");
			}
			
			
			// when if condition is false and have to check one more condition we use else if
			int AB = 10;
			int BC = 20;
			int CD = 30;
			if (AB>BC)
			{
				System.out.println("AB is greater than BC");				
			}
			else if (BC > CD)
			{
				System.out.println("BC  is greater than CD");
			}
			else {
				System.out.println("CD is greatest"); // if uncompilation error comes may be because of 
				}
			
			
			// Short hand if
			//variable = (condition)? true expression :  false
			String GH = (D<C)? "D is greater than C" : "D is smaller than C";
			System.out.println(GH);
			
			// Nested if
			// when  we have to check multiple if condition we use nested if    
			int myage=25;
			boolean isCitizen = true;
			if (myage > 18){
				System.out.println("Eligible to vote");// for Nested if we shouldn't give close bracket until the else condition is completed
			if (isCitizen){ // It will say delete access code if .. stmt {if.. else ...}.. else
				System.out.println("And you are a citizen");
			}else {
				System.out.println("You are not a citizen");
		    }
			}else {
				System.out.println("Not eligible to vote");
			}
			
			
			// Logical  &&, || ,!
			//Example
			boolean IsAdmin =  true;
			boolean IsOTPPassed =  false;
			int SecurityLevel = 3;
			 if (IsAdmin && (IsOTPPassed || SecurityLevel <= 2))
			 {
				 System.out.println("You are allowed");
			 }else {
				 System.out.println("You are not allowed");
			 } 
}
}