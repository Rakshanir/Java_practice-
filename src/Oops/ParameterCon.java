package Oops;
class Employees{
	String name;
	int salary;
	Employees(String n,int s){
		name=n;
		salary=s;
	}
}

public class ParameterCon {

	public static void main(String[] args) {
		Employees e1 = new Employees("Anu", 30000);
		Employees e2 = new Employees("John", 50000);
		System.out.println("Employee Name :"+ e1.name);
		System.out.println("salary :"+ e1.salary);
		System.out.println("Employee Name :"+ e2.name);
		System.out.println("salary :"+ e2.salary);

	}

}
