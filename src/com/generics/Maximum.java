package com.generics;

/**
 * Program to find the maximum of given three variables 
 * using class level generics using array
 * @author Sheetal
 * @since 2021-08-18
 */
public class Maximum <T extends Comparable<T>>{
	//generics array
	private T[] inputArray;
	
	//constructor
	public Maximum(T[] inputArray) {
	        this.inputArray=inputArray;
	    }
		
	//method to find max of array of any data type
	private static <T extends Comparable> void getMaximum(T[] array){
	        T max = array[0];
	        for (int i=0;i<array.length; i++){
	            if (array[i].compareTo(max)>0){
	                max=array[i];
	            }
	        }
	        System.out.println("Maximum : "+max);
	    }
	
	/**
	 * main method where
	 * we are declaring and initialising array of integer , double and string and
	 * printing the maximum of respective data
	 * @param args unused
	 */
	public static void main(String[] args) {
	        // Declaring array of  INTEGER,FLOAT,STRING
	    	Integer[] intArray={10,9,8,7,6,5,56};
	        Double[] doubleArray={3.3,6.67,4.56,89.43};
	        String[] stringArray={"a","abc","abcgss","abcde"};
	        
	        System.out.println("maximum of integer [10,9,8,7,6,5,56] values are");
	        Maximum.getMaximum(intArray);
	        
	        System.out.println("maximum of double [3.3,6.67,4.56,89.43] values are");
	        Maximum.getMaximum(doubleArray);
	        
	        System.out.println("maximum of string [ a,abc,abcgss,abcde ] values are");
	        Maximum.getMaximum(stringArray);
	    }
}