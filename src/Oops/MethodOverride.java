package Oops;
class Office{
	 void work() {
		 System.out.println("coding");
	 }
}
class Developer extends Office{
	@Override
	void work() {
		System.out.println("Developer writes code");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		d.work();

	}

}
