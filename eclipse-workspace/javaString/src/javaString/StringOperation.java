package javaString;

public class StringOperation {
	public static void main(String ar[]) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);

		String s1 = "  Sachin  ";
		System.out.println(s1);
		System.out.println(s1.trim());

		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("n"));

		System.out.println(s.charAt(0));  
		System.out.println(s.charAt(3));   

		System.out.println(s.length());   

		String s2=new String("Sachin");    
		String s3=s.intern();    
		System.out.println(s3);
		System.out.println(s==s2);
		System.out.println(s3==s2);
		System.out.println(s3==s);

		int a=10;    
		String s4=String.valueOf(a);    
		System.out.println(s4+10);    
		
		String s5="Java is a programming language. Java is a platform. Java is an Island.";      
		String replaceString=s5.replace("Java","Kava");
		System.out.println(replaceString);   

	}

}
