package javaString;

public class strFormat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(" World");
		String s = String.format("%s%s", s1, s2);
		System.out.println(s);
	}
}
