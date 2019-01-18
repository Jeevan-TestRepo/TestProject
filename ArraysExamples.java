package com.java.arrays;

public class ArraysExamples {

	static int firstNumber = 0, secondNumber = 1, result=0; 
	 void recursion(int fibbonaciNumberLimit){		
		if(fibbonaciNumberLimit>0){
		result = firstNumber+secondNumber;		
		firstNumber = secondNumber;
		secondNumber = result;
		System.out.print(result+" ");
		recursion(fibbonaciNumberLimit - 1);
		}
				
	}
	public static void main(String [] args){
		ArraysExamples sd = new ArraysExamples();
		System.out.print(firstNumber +" "+secondNumber+" ");
		sd.recursion(10);

	}
}
