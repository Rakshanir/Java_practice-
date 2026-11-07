package Oops;
class Em{
	String name;
	int salary;
	Em(String s,int n){
		name=s;
		salary=n;
		
	}
	void display() {
	    System.out.println("Employee Name: " + name);
	    System.out.println("Salary: " + salary);
	}
}
public class Parameters {

	public static void main(String[] args) {
		Em e1 = new Em("Anu",30000);
		Em e2 = new Em("John",50000);

		e1.display();
		e2.display();

	}

}
