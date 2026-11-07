package LambdaExpression;

import java.util.ArrayList;

public class Stream {

	public static void main(String[] args) {
		ArrayList<Integer> num =new ArrayList<>();
		num.add(10);
		num.add(15);
		num.add(20);
		num.add(25);
		num.stream().filter(n ->n%2==0)
		.forEach(n->System.out.println(n));
	}

}
