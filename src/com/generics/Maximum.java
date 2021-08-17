package com.generics;

/**
 * Program to find the maximum of given three strings
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
		String l = "apple";
		String m = "banana";
		String n = "orange";
		//calling method to main
		findMaximum(l,m,n);
		
		
	}
		
	/**
	 * Method to find Maximum of given three strings using compare to
	 * @param l 
	 * @param m
	 * @param n
	 * @return maximum of l,m,n
	 */
	private static void findMaximum(String l, String m, String n) {
		String max = l;
		if (m.compareTo(l)>0) {
			max = m;
		}
		if (n.compareTo(max)>0) {
			max = n;
		}		 System.out.println("Maximum of strings-" +max);
	}
}