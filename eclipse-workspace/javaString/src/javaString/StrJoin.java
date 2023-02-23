package javaString;

public class StrJoin {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String(" World");
		String s = String.join("", s1, s2);
		System.out.println(s);
	}
}
