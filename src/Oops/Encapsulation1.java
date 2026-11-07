package Oops;

public class Encapsulation1 {
	private String brand;
	private String model;
	private String  storage;
	private int price;
    public String getBrand() {
		return brand;
	}

    public void setBrand(String brand) {
		this.brand = brand;
	}
    public String getModel() {
		return model;
	}
    public void setModel(String model) {
		this.model = model;
	}
    public String getStorage() {
		return storage;
	}

    public void setStorage(String storage) {
		this.storage = storage;
	}
    public int getPrice() {
		return price;
	}
    public void setPrice(int price) {
		this.price = price;
	}

public static void main(String[] args) {
		Encapsulation1 ens= new Encapsulation1();
		ens.setBrand("Samsung");
		ens.setModel("S25");
		ens.setPrice(85000);
		ens.setStorage("256GB");

		System.out.println(ens.getBrand());
		System.out.println(ens.getModel());
		System.out.println(ens.getPrice());
		System.out.println(ens.getStorage());
	}

}
