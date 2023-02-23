package javaString;

public class TestStringConcatenation {
	public static void main(String[] args) {
		String s1 = "Sachin" + " Tendulkar";
		System.out.println(s1);
		
		String s2=50+30+"Sachin"+40+40;  
		System.out.println(s2);
		
		String s3 = "Hello";
		String s4 = " World";
		s3 = s3.concat(s4);
		System.out.println(s3);
	}
}
