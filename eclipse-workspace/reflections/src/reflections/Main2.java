package reflections;

import java.lang.Class;
import java.lang.reflect.*;

interface Animals {
	public void display();
}

interface PetAnimals {
	public void makeSound();
}

class Dog implements Animals, PetAnimals {
	public void display() {
		System.out.println("This is a PetAnimal::Dog");
	}

	public void makeSound() {
		System.out.println("Dog makes sound::Bark bark");
	}
}

class Main2 {
	public static void main(String[] args) {
		try {
			Dog dog = new Dog();
			Class obj = dog.getClass();
			Class[] objInterface = obj.getInterfaces();
			System.out.println("Class Dog implements following interfaces:");
			for (Class citem : objInterface) {
				System.out.println("Interface Name: " + citem.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}