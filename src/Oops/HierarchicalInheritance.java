package Oops;
class Shape{
	void display() {
		System.out.println("Shape is displayed");
	}
}
class Circle extends Shape{
	void drawCircle() {
		System.out.println("Circle is drawn");
	}
}
class Rectangle extends Shape{
	void drawRectangle() {
		System.out.println("Rectangle is drawn");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Circle c =new Circle();
		Rectangle r = new Rectangle();
		c.display();
		c.drawCircle();
		r.display();
		r.drawRectangle();
		
		

	}

}
