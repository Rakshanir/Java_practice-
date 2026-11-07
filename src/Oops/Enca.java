package Oops;
class Empl{
  private String name;
 
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
}

public class Enca {

	public static void main(String[] args) {
		Empl e= new Empl();
		e.setName("kutty");
		System.out.println(e.getName());
		

	}

}
