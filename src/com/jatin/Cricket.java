package com.jatin;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           cricScore(1,1,1,1,1);
  }
	
	public static void cricScore( int ones , int twos , int threes, int fours ,int sixs) {
		
		int total = ones + (twos * 2) + ( threes * 3 )+ ( fours * 4)+ (sixs * 6);
		
		System.out.println(total);
		
	}

}
