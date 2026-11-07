package Oops;
class Emp {
    void calculateBonus() {
        System.out.println("Employee Bonus: 2000");
    }
}

class Dev extends Emp {
    @Override
    void calculateBonus() {
        System.out.println("Developer Bonus: 5000");
    }
}


public class MethodOverriding {

	public static void main(String[] args) {
		 Emp e = new Emp();
	        e.calculateBonus();

	        Dev d = new Dev();
	        d.calculateBonus();

	}

}
