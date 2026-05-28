package com.TestingAutomationProject.java.day04;

public class Switch {

	public static void main(String[] args) 
	{
		String role = "Admin";
		switch (role) 
	{
		case "Tester" :
			System.out.println("You will get access to lower environment"); // here the case is true  and there is no break key word so next statement also run.
		case "Admin" :
			System.out.println("You will get all the access");
		case "User" : 
			System.out.println("You will get access based on your plan");
	}
        int day = 3;
        switch (day) {
       case 1 :
    	   System.out.println("Its Monday today");
    	   break;
       case 2 :
    	   System.out.println("Its Tuesday today");
    	   break;
       case 3 :
    	   System.out.println("Its Wednesday today");
		   break;
       case 4 :
    	   	System.out.println("Its Thursday today");
    	   	break;
       case 5 :
    	   	System.out.println("Its Friday today");
    	   	break;
       case 6 :
    	   	System.out.println("Its Saturday today");
    	   	break;
       case  7:
    	   	System.out.println("Its Sunday today");
    	   	break;
	
        }
        int Day = 4;
        switch (Day) {
       case 6 :
    	   System.out.println("Its Saturday today");
    	   break;
       case 7 :
    	   System.out.println("Its Sunday today");
    	   break;
       default :
    	   System.out.println("I\'m Looking for the weekend");
		   break;
		}
	}

}
