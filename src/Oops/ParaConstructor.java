package Oops;
class Employe{
	String name;
	Employe(String n){
		name=n;
		
	}
}
public class ParaConstructor {

	public static void main(String[] args) {
		Employe e= new Employe("rakshu");
		System.out.println(e.name);
		

	}

}
