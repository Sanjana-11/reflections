package javaString;

import java.util.StringJoiner;

public class StrJoiner {
	 public static void main(String args[])  
	    {  
	        StringJoiner s = new StringJoiner(",");     
	        s.add("Hello");     
	        s.add("World");      
	        System.out.println(s);  
	    }  

}
