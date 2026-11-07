package Loop;

public class Dowhilesum {

	public static void main(String[] args) {
		int i=2;
		int sum=0;
		do {
			sum=sum+i;
			i+=2;
		}
		while(i<=10);
		System.out.println(sum);

	}

}
