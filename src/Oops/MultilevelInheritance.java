package Oops;
class Person {
	void walk() {
		System.out.println("Person is walking");
	}
	
}
class Emplo extends Person{
	void work() {
		System.out.println("Employee is working");
	}
}
class Managers extends Emplo{
	void manage() {
		System.out.println("Manager is managing");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Managers m= new Managers();
		m.walk();
		m.work();
		m.manage();
		

	}

}
