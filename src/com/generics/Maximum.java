package com.generics;

/**
 * Program to find the maximum of given three integers
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
		Integer a=2; 
		Integer b=4; 
		Integer c=6;
		//calling method to main
		findMaximum(a,b,c);
	}
		
	/**
	 * Method to find Maximum of given three integers using compare to
	 * @param a 
	 * @param b
	 * @param c
	 * @return maximum of a,b,c
	 */
	private static void findMaximum(Integer a, Integer b, Integer c) {
			Integer max = a;
			if (b.compareTo(a)>0) {
				max = b;
			}
			if (c.compareTo(max)>0) {
				max = c;
			}
		 System.out.println("Maximum of numbers are " +max);
	}
}