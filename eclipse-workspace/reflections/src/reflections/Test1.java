package reflections;

class Simple {
}

public class Test1 {
	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) {
		Simple s = new Simple();
		Test1 t = new Test1();
		t.printName(s);
	}
}
