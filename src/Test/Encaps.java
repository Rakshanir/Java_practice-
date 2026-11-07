package Test;

public class Encaps {
	private String name;
	private int age;
	

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


	public static void main(String[] args) {
		Encaps en=new Encaps();
		en.setName("rakshani");
		en.setAge(22);
		System.out.println(en.getName());
		System.out.println(en.getAge());

	}

}
