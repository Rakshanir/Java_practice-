package Oops;

public class Encapsulation {
	private String name;
	private int age;
	private long rollno;
	public String getName() {
		return name;
	}
     public void setName(String name) {
		this.name = name;
	}
     public int getAge() {
		return age;
	}
     public void setAge(int age) {
		this.age = age;
	}
     public long getRollno() {
		return rollno;
	}
    public void setRollno(long rollno) {
		this.rollno = rollno;
	}

public static void main(String[] args) {
		Encapsulation en= new Encapsulation();
		en.setName("rakshu");
		en.setAge(23);
		en.setRollno(879875);
		System.out.println(en.getName());
		System.out.println(en.getAge());
		System.out.println(en.getRollno());
		

	}

}
