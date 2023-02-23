package javaString;

import java.util.*;
import java.util.stream.Collectors;

public class ColJoining {

	public static void main(String args[]) {
		List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); 
		String str = liststr.stream().collect(Collectors.joining(", ")); 
		System.out.println(str.toString()); 
	}

}
