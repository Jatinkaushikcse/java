package com.jatin;

public class Switch {
   public static void main(String[] args) {
	
	   city("Kolkata");
	   
}
   public static void city( String srt) {
	   switch(srt) {
	   case "Mumbai" : System.out.println("Financial city");
	                  break;
	   case "Kolkata" : System.out.println("City of Joy");
	                  break;
	   case "Delhi"  : System.out.println("Capital of the country");  
	                 break;
	   case "Bangalore"  : System.out.println("Cyber City");
	                  break;
	   default : System.out.println("May be Other Indian City");               
	   }
   }
}

