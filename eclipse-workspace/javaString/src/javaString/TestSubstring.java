package javaString;

import java.util.Arrays;

public class TestSubstring {
	public static void main(String args[]) {
		String s = "SachinTendulkar";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(6));
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6));

		String text = new String("Hello, My name is Sachin");
		String[] sentences = text.split(",\\.");
		for(int i=0;i<sentences.length; i++) {
			System.out.println(sentences[i]);
		}
	}

}
