package com.TestingAutomationProject.java.day01;

public class Variables {

	public static void main(String[] args) {
		// int, string, char, boolean,float
		/*
		 * int = just numbers no digits
		 * String- starts with CAPS and in double quotes
		 * char- sinle letters and in in single quotes
		 * boolean- is true  or false
		 * float- with decimals*/
		int A= 3;
		int B = 5;
		System.out.println(A+B);
		String name= "Priyanka";
		char grade= 'A';
		boolean Girl= true;
		float CGP=8.5f;
		
		System.out.println("My name is "+name);
		System.out.println("My grade is "+ grade);
		System.out.println("I'm a girl "+ Girl );
		System.out.println("My CGP is "+ CGP);
		
		//final- Where we can't change the value of the variables
		 int Ant =10;
		System.out.println("Ant is "+ Ant);
		final int Bat=15;
		int AntBat=Ant+Bat;
		System.out.println("Sum of Ant and Bat is " + AntBat);
		//multi variable
		int X=10, Y=15,Z=20;
		int XYZSum = X+Y+Z;
		System.out.println("Sum of X,Y,Z is "+XYZSum);
		
		int P,Q,R;
		P=Q=R=20;
		int PQRSum= P+Q+R;
		System.out.println("Sum of XP,Q,R is "+PQRSum);
		//indentifiers
		
		//Ant, Bat, X,Y,Z; P,Q,R are identifiers 
		/*
		 * Its advised to give Identifiers meaningful which make the code more readable
		 * Try avoid repeating the identifiers*/
		
		int length = 10;
		int breath = 3;
		int rectangle;
		
		rectangle= length*breath;
		System.out.println("Area of the rectangle is "+ rectangle);
		//Invalid Identifiers
		/*
		 * Should not start with numbers
		 * shouldn't contain space
		 * shouldn't use reserved keywords Eg : int*/
		
		Ant= 15; // when declared 1st gave int as DT but while giving the value again no need of mentioning the DT else it will show some error.
		//Bat= 10;  It will give error as Bat is final when declared.. Also we can't declare the variable 1st and give final for same variable. 
		System.out.println("Sum of Ant and Bat is " + AntBat);


	}

}
