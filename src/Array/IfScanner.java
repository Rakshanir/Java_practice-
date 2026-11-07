package Array;

import java.util.Scanner;

public class IfScanner {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("you can vote");
		}

	}

}
