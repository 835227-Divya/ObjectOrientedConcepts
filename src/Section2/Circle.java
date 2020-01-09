package Section2;

import Section1.Shape;

public class Circle extends Shape {
	int radius;

	double calculateArea() {
		return 3.1415* (radius * radius);
	}

	public Circle(int radius, String shapeName) {
		super(shapeName);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;

	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
