package com.TestingAutomationProject.java.day02;

public class Operators {

	public static void main(String[] args) {
		// Operators help to do certain tasks....
		// Arithmetic,  Assignment, Comparison, Logic, precedence
		
		// Arithmetic +,-, *, / , %,  ++ , --
		int A = 35;
		int B = 4;
		System.out.println("A + B is "+ A + B);
		System.out.println("A - B is "+( A - B)); //  without bracket it will show error as after " it will take Aas string and - as error..
		System.out.println("A / B is "+ A / B);
		System.out.println("A % B is "+ A % B);
		System.out.println("A * B is "+ A * B);
		
		int z = 10;
		z++;
		z--;
		System.out.println("Z is "+ z);
		

//Assignment =, +=,-=, *= /=, %=, &=, |=, ^=, >>, <<
		int C = 32;
		System.out.println("C is " + C);
		System.out.println("C += 3 is " + (C += 3));
		System.out.println("C -= 3 is "+ (C -= 3)); // c=c=3
		System.out.println("C *= 3 is "+ (C *= 3));
		System.out.println("C /= 3 is "+ (C /= 3));
		System.out.println("C %= 3 is "+ (C %= 3)); // modulus
		System.out.println("C &= 3 is "+ (C &= 3));// bitwise and operator when both byets have equals adds one and gives value
		System.out.println("C |= 3 is "+ (C |= 3)); //bitwise and operator any one of the bytes have one adds one and gives value
		System.out.println("C ^= 3 is "+ (C ^= 3)); //XOR bitwise and operator same values becomes  zero
		System.out.println("C >>= 3 is "+ (C >>= 3));  // right shift  bitwise value moves to 3 places to the right.. and gives the values 1000 -- 0001
		System.out.println("C <<= 3 is "+ (C <<= 3)); // left shift vice versa to >>= 
		
		
		// Example
		int Savings = 1000;
		Savings += 50;
		System.out.println("Savings is "+ Savings);
		
		
//Comparison ==, !=, <,>, <=, >=
		
		int D = 65;
		int E =  34;
		System.out.println("D == E is " + (D == E));
		System.out.println("D != E is " + (D != E));
		System.out.println("D < E is " + (D < E));
		System.out.println("D > E is " + (D > E));
		System.out.println("D <= E is " + (D <= E));
		System.out.println("D >= E is " + (D >= E));
		
// Logical &&, ||, !
		int F = 54;
		int G = 23;
		System.out.println("F && G is "+ (F<5 && G>5));// Both needs to be correct
		System.out.println("F || G is "+ (F<5 || G>5)); // any one values needs to be correct to be true
		System.out.println("F ! G is "+ !(F <5 !=G>5)); // if end result is values ! this makes it true
		
// Example 
		
		boolean IsUser = true;
		boolean IsOTPPassed = true;
		System.out.println("Is a User? "+ IsUser);
		System.out.println("Is a Verified user? "+ IsOTPPassed);
		System.out.println("IsUser && IsOTPPassed) " + (IsUser && IsOTPPassed));
		System.out.println("IsUser || IsOTPPassed) " + (IsUser || IsOTPPassed));
		System.out.println("IsUser != IsOTPPassed) " + (IsUser != IsOTPPassed));
		
// Precedence the order how the value gets calculated (BODMAS)
		System.out.println("F + G * A = "+ F + G* A);
		System.out.println("(F + G) * A = "+ (F + G)* A);

	}

}
