package LambdaExpression;

import java.util.ArrayList;

public class LambdaArraylist {

	public static void main(String[] args) {
		ArrayList<Integer>num= new ArrayList<>();
		num.add(5);
		num.add(9);
		num.add(8);
		num.add(1);
	//	System.out.println("original list");
	//	num.forEach(n->System.out.println(n));
		//forEach meal print all number
		num.removeIf(n ->n<5);
		System.out.println("after remove");
		num.forEach(n ->System.out.println(n));
		num.replaceAll(n ->n*2);
		System.out.println("after replaceall");
		num.forEach(n ->System.out.println(n));
		num.sort(Integer::compare);
		System.out.println("after sort");
		num.forEach(n ->System.out.println(n));
	}

}
