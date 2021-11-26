package com.equal.eualignorence;

public class EqualAndEqualIgnorence {
	
	
	    public static void main(String args[]){
	    	 String a = "NAINA";
	         String b = "naina";

	    	
	    	
	        if(a.equals(b)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }

	        if(a.equalsIgnoreCase(b)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }
	    }
	

	    
}
