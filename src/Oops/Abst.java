package Oops;
abstract class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	abstract void sound();
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Cat says Meow");
	}
	
}

public class Abst {

	public static void main(String[] args) {
		
		Cat c= new Cat();
		c.eat();
		c.sound();

	}

}
