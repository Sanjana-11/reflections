package javaString;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1);
		
		char ch[] = {'j','a','v','a'};
		String s2 = new String(ch);
		System.out.println(s2);
		
		String s3 = new String("java");
		System.out.println(s3);

	}
}
