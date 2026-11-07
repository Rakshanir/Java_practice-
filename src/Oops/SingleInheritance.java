package Oops;
class Vehicless{
	void start() {
		System.out.println("Vehicle is starting");
	}
}
class car extends Vehicless{
	void drive() {
		System.out.println("Car is driving");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		car c= new car();
		c.start();
		c.drive();
		

	}

}
