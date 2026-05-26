package com.TestingAutomationProject.java.day02;

public class DataTypes {

	public static void main(String[] args) {
		// Primitive and non preimitive
		/*
		 * Primitiveis  predifined -  byte, short, int , long
		 * Non Primitives are by the developers  - String, Array, Classes (exept String)
		 * Primitives are in small letters whereas Non-primitive starts with caps*/
byte EmployeeID = 1;
short MonthlyIncome = 32000;
int AnnualIncome = 100000;
long TotalWealth  = 434343432;
char Grade = 'A';
String Objective = "healthy and rich";
System.out.println("My EmployeeID is "+ EmployeeID);
System.out.println(" My MonthlyIncome is "+ MonthlyIncome);
System.out.println("My AnnualIncome is "+ AnnualIncome);
System.out.println("My TotalWealth is "+ TotalWealth);
System.out.println("My Grade is "+ Grade);
System.out.println("My Objective is to be "+ Objective );

//Float points integers, float and double float can have 5-6 digits,where double can have 16 digits,float needs to be mentioned in f,
float Rate = 12.5f;
float Price = 30.3234245f;
double TotalAmout = Rate * Price; // scientific terms like e can be used with float and double

System.out.println("Total Amout is "+ TotalAmout);

/*  
   * Non Primitive can be without values but Primitive must have values
   * once Datatypes is declared its not replaceable
* */

boolean isPriyankaGoesToGym = true;
boolean isNegativeSelfTalk = false;
System.out.println("Does Priyanka Goes to Gym "+ isPriyankaGoesToGym);
System.out.println("Does Priyanka allows negative self talk "+ isNegativeSelfTalk );

int Mynum = 19;
//Mynum= "Priyanka"; is not possible data type can not be changed once its declared.


//Variable var is used instead of giving the actual data type, useful for arraylist and Hashmaps 
// var x; is not possible have to give the value while giving it.
var StudentIDs = 2;
var Income = 3200;
var Pop = 434343432;
char Section = 'A';

System.out.println("My ID is "+ StudentIDs);
System.out.println("My Income is "+ Income);
System.out.println("My state population is "+ Pop);
System.out.println("My Section is "+ Section);

//we can call letters using ASCII num with character

char var1 = 80, var2 = 82, var3 = 73, var4 = 89, var5 = 65, var6= 78, var7= 75, var8 = 65;
System.out.println("Myname with ASCII values "+ var1 + var2+ var3 + var4 + var5 + var6 + var7 + var8); //Myname with ASCII values PRIYANKA output


	}

}
