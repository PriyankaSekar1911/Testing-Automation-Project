package com.TestingAutomationProject.java.day03;

public class Strings {

	public static void main(String[] args) {
		// Strings - length, changing upper and lower case, trim, indexof(), charAt(), eguals cancatenation, special characters
		String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Alpha.length());  
		
		String Alphaa ="abcdefghijklmnopqrstuvwxyz";
		String Alphaaa ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Converted to Upper case is "+Alphaa.toLowerCase());
		System.out.println("Converted to Lower case is "+Alphaaa.toUpperCase());
		
		System.out.println("Index value of P is "+ Alphaa.indexOf("p"));
		System.out.println("Character at index 3 is "+Alphaa.charAt(3));
		
		String World ="  Hello world   ";
		System.out.println("Before Trimming value is ["+ World +"]");
		System.out.println("Trimmed value is ["+ World.trim()+"]");
		
		System.out.println(Alphaa.equals(Alphaaa));
		System.out.println(Alpha.equals(Alphaaa));
		
		// cancatenation is adding string with string and with numbers
	// either by +or cancat method
		System.out.println(" Upper case is ["+ Alpha +"]" + " Lower case is ["+ Alphaa +"]");
		String ABC= "10";
		int ABCD = 20;
		System.out.println(ABC + ABCD);
		System.out.println(ABC.concat(World));// only work with strings
		
		String D = "Java";
		String E ="is";
		String F = "Fun";
		
		System.out.println(D.concat(E).concat(F));
		 String Sp ="(Im \"learnig\" Java from online)";
		 System.out.println(Sp);
		/*
		 *\\ is for adding back slash in the text, \' for single quote*
		 *\n - newline*
		 *\t -new tab*
		 */
	}

}
