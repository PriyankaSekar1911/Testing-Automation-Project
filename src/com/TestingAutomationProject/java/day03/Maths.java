package com.TestingAutomationProject.java.day03;

public class Maths {

	public static void main(String[] args) {
		// min, max, sqrt, abs, pwr, rounding, random (between 0 and 1)
		
		System.out.println("Minimum value is "+ (Math.min(3,5)));
		int A =25;
		int B = 10;
		var C = 30.343;
		int D = 34;
		System.out.println("Minimum value is "+ (Math.min(A,B))); //	System.out.println("Minimum value is "+ (Math.min(A,B,D))); applicable only to two values not three
		System.out.println("Maximum value is "+ (Math.max(A,B)));
		System.out.println("Square root  value is "+ (Math.sqrt(A)));
		System.out.println("Absolute value is "+ (Math.abs(C)));
		System.out.println("Absolute value is "+ (Math.abs(D)));
		System.out.println("power value is "+ (Math.pow(A,B)));
		
		System.out.println("Ceiling value is "+ (Math.ceil(C)));
		System.out.println("Rounding value is "+ (Math.round(C)));
		
		System.out.println("Random value is "+ (Math.random()));		
	

	}

}
