package reflections;

import java.lang.Class;
import java.lang.reflect.*;

class Student2 {
	private String rollNo;
}

class Main4 {
	public static void main(String[] args) {
		try {
			Student2 student = new Student2();
			Class obj = student.getClass();
			Field field2 = obj.getDeclaredField("rollNo");
			field2.setAccessible(true);
			field2.set(student, "27");
			System.out.println("Field Information of rollNo:");
			int mod2 = field2.getModifiers();
			String modifier2 = Modifier.toString(mod2);
			System.out.println("rollNo modifier::" + modifier2);
			String rollNoValue = (String) field2.get(student);
			System.out.println("rollNo Value::" + rollNoValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}