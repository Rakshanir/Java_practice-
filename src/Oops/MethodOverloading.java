package Oops;
class StudentDetails {

    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    void display(String name, int age, String department) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class MethodOverloading {

	public static void main(String[] args) {
		 StudentDetails s = new StudentDetails();

	       

	        s.display("Rakshani", 22, "IT");

	}

}
