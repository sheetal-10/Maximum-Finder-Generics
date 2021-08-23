package com.generics;

/**
 * Program to find the maximum of given three variables 
 * using class level generics
 * @author Sheetal
 * @since 2021-08-18
 */
public class Maximum <T extends Comparable<T>>{
	//variables
	T num1;
	T num2;
	T num3;
	
	/**
	 * main method where 
	 * variables are assigned values
	 * and printing the maximum of the given values
	 * @param args unused
	 */
	public static void main(String[] args) {
   	  System.out.println("Maximum Integer by creating Generic class :" + new Maximum(4, 6, 8).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum(2.5f, 4.56f, 3.45f).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum("lotus","rose","lily").GenericMax());
   }
	
	 //constructor
    public Maximum(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


    public T GenericMax() {
    	return Maximum.GenericMax(num1, num2, num3);
    }

    //generics method to compare three varaibles and find maximum
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
		
}