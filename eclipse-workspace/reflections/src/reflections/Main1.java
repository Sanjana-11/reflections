package reflections;

import java.lang.Class;

interface Person {
	public void display();
}

class Student implements Person {
	public void display() {
		System.out.println("I am a Student");
	}
}

class Main1 {
	public static void main(String[] args) {
		try {
			Student s1 = new Student();

			Class obj = s1.getClass();

			Class superClass = obj.getSuperclass();
			System.out.println("Superclass of Student Class: " + superClass.getName());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}