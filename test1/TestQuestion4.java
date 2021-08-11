package com.Techment.Day8.test1;
abstract class Animal
{
	abstract void Shout();
}
class Horse extends Animal
{

	@Override
	void Shout() {
		// TODO Auto-generated method stub
		System.out.println("Horse Shout Aeeee");
	}
	
}
class Cat extends Animal
{

	@Override
	void Shout() {
		// TODO Auto-generated method stub
		System.out.println("Cat Shout Meow");
		
	}
	
}
class Dog extends Animal
{

	@Override
	void Shout() {
		System.out.println("Dog Shout Bark");
		
	}
	
}
public class TestQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		cat.Shout();
		Dog dog = new Dog();
		dog.Shout();
		Horse horse = new Horse();
		horse.Shout();
	}

}
