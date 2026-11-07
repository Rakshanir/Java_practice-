package LambdaExpression;
@FunctionalInterface
interface cal{
	int add(int a, int b);
}

public class Lambda {

	public static void main(String[] args) {
		cal c=(a,b)->a+b;
		System.out.println(c.add(10, 260));
	}

}
