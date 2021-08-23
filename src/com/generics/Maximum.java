package com.generics;

/**
 * Program to find the maximum of given three strings
 * @author Sheetal
 * @since 2021-08-18
 */
public class Maximum {
	/**
	 * Method where 
	 * we are using method level generics to
	 * find maximum of three numbers
	 * @param args unused
	 */
	 public static <T extends Comparable> T findMax(T num1, T num2, T num3) {
	        T max = num1;
	        if (num2.compareTo(max) > 0) {
	            max = num2;
	        }
	        if (num3.compareTo(max) > 0) {
	            max = num3;
	        }
	        System.out.printf("Maximum of numbers are " +max);
	        return max;
	    }
		
}