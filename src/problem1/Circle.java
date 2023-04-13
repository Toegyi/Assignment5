package problem1;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * 3.14 * radius;
	}
}
