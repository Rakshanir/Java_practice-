package Oops;
class Employee {
    String name = "Rakshani";
    int salary = 20000;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}
public class In {
	  public static void main(String[] args) {

	        Manager m = new Manager();

	        m.display();
	        m.showDepartment();
	    }

	

}
