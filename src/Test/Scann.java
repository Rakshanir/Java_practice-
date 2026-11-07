package Test;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		Scanner st= new Scanner(System.in);
		String name= st.nextLine();
		int score = st.nextInt();
		st.nextLine();
		String dep =st.nextLine();
		System.out.println("name :"+ name);
		System.out.println("score :"+ score);
		System.out.println("dep :"+ dep);

	}

}
