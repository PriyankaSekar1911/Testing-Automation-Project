package com.TestingAutomationProject.java.day03;

public class Boolean {

	public static void main(String[] args) {
		int D = 65;
		int E =  34;
		System.out.println("D == E is " + (D == E));
		System.out.println("D != E is " + (D != E));
		System.out.println("D < E is " + (D < E));
		
		int myage =25;
		int votingAge =18;
		if (myage >= votingAge) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}

}
