package com.jatin;

public class Prime {

	public static void main(String[] args) {
      
		 primeFactores(12);
 
	}
	public static void primeFactores ( int num) {
		
		if( num > 2 && num <= 100) {
			
			for( int i=1 ; i<=num; i++) {
				
				if( num%i == 0) {
					System.out.print(i);
				}
			}
			
		}
		else {
			System.out.println("Invalid number");
		}
		
	}

}
