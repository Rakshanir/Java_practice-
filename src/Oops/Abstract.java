package Oops;
abstract class Vehicle{
	abstract void start();
}
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike starts with self-start.");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Bike b= new Bike();
		b.start();
		
		

	}

}
