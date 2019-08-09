
package Assign3_4;


	public class Assign3_4 
	{ 
	    // block to be executed before any constructor. 
	    { 
	        System.out.println("init block"); 
	    } 
	  
	    // no-arg constructor 
	    Assign3_4() 
	    { 
	        System.out.println("default"); 
	    } 
	  
	    // constructor with one arguemnt. 
	    Assign3_4(int x) 
	    { 
	        System.out.println(x); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        // Object creation by calling no-argument  
	        // constructor. 
	        new Assign3_4(); 
	  
	        // Object creation by calling parameterized  
	        // constructor with one parameter. 
	        new Assign3_4(10); 
	    } 
	} 