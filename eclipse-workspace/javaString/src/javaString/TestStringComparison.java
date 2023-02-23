package javaString;

public class TestStringComparison {
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Sourav";
		String s5 = "SACHIN";
		String s6 = "Ratan";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s6));
		System.out.println(s6.compareTo(s1));
	}
}
