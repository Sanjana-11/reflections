package reflections;

import java.lang.Class;
import java.lang.reflect.*;

class Vehicle {
	public void display() {
		System.out.println("I am a Vehicle!!");
	}

	protected void start() {
		System.out.println("Vehicle Started!!!");
	}

	protected void stop() {
		System.out.println("Vehicle Stopped!!!");
	}

	private void serviceVehicle() {
		System.out.println("Vehicle serviced!!");
	}
}

class Main5 {
	public static void main(String[] args) {
		try {
			Vehicle car = new Vehicle();
			Class obj = car.getClass();

			Method[] methods = obj.getDeclaredMethods();

			for (Method m : methods) {
				System.out.println("Method Name: " + m.getName());

				int modifier = m.getModifiers();
				System.out.print("Modifier: " + Modifier.toString(modifier) + "  ");

				System.out.print("Return Type: " + m.getReturnType());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}