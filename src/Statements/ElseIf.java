package Statements;

public class ElseIf {

	public static void main(String[] args) {
		int mark=92;
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark>=75) {
			System.out.println("Grade B");
		}
		else if(mark>=50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}

	}

}
