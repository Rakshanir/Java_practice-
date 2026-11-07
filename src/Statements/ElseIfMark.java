package Statements;

public class ElseIfMark {

	public static void main(String[] args) {
		int age=65;
		if(age<18) {
			System.out.println("Minor");
		}
		else if(age<60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}

	}

}
