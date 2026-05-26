package com.TestingAutomationProject.java.day02;

public class TypeCasting {

	public static void main(String[] args) {
		// Its a way to change the data type it is of two types..
		// Widening - byte, short, char, int, long, float , double can done directly
		// Narrowing -  vice versa can only be done by manual
		
		int Mynum = 200; 
		double Mydouble = Mynum ;
		System.out.println("Now the double value is "+ Mydouble);
		
		
		
		double ABCdouble = 545;
		int ABCnum = (int) ABCdouble;
		System.out.println("Now the int value is "+ ABCnum);

		int marks = 450;
		int total = 500;
		double percentage = (double) marks / total * 100d;
		System.out.println("My percentage is "+ percentage);


	}

}
