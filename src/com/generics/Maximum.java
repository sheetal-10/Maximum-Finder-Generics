package com.generics;

/**
 * Program to find the maximum of given three floats
 * @author Sheetal
 * @since 2021-08-17
 */
public class Maximum {
	/**
	 * Main method where 
	 * variables are declare and initialise and
	 * calling findMaximum method to main
	 * @param args unused
	 */
	public static void main(String[] args) {
		//declaring and initialising varaibles
		Float x = 3.4f;
		Float y = 4.6f;
		Float z = 6.7f;
		//calling method to main
		findMaximum(x,y,z);
	}
		
	/**
	 * Method to find Maximum of given three floats using compare to
	 * @param x 
	 * @param y
	 * @param z
	 * @return maximum of x,y,z
	 */
	private static void findMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(x)>0) {
			max = y;
	}
		if (z.compareTo(max)>0) {
			max = z;
		}
		 System.out.println("Maximum of numbers are " +max);
	}
}