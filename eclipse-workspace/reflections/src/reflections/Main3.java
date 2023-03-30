package reflections;

import java.lang.Class;
import java.lang.reflect.*;

class Student1 {
	public String StudentName;
}

class Main3 {
	public static void main(String[] args) {
		try {
			Student1 student = new Student1();
			Class obj = student.getClass();

			Field studentField = obj.getField("StudentName");
			System.out.println("Details of StudentName class field:");
			studentField.set(student, "Lacey");

			int mod1 = studentField.getModifiers();
			String modifier1 = Modifier.toString(mod1);
			System.out.println("StudentName Modifier::" + modifier1);
			String typeValue = (String) studentField.get(student);
			System.out.println("StudentName Value::" + typeValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
