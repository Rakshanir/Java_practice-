package Oops;
class vehicle{
	void start() {
		System.out.println("bike");
	}
}
class bike extends vehicle{
	@Override
	void start() {
		System.out.println("Bike starts with self-start");
	}
}
public class Overriding {

	public static void main(String[] args) {
		bike b= new bike();
		b.start();
		

	}

}
