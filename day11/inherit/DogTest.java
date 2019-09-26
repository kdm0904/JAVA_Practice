package org.day11.inherit;

class Animal {
	void sound() {
		
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("¸Û¸Û!");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		d.sound();
	}

}
