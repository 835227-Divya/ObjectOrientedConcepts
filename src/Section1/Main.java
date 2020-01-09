package Section1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Square\n3.Circle");
		System.out.println("Area Calculator---Choose your Shape");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Enter the length and breadth");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			Rectangle r = new Rectangle(length, breadth, "Rectangle");
			System.out.printf("Area of rectangle is:%.2f", r.calculateArea());
			break;
		case 2:
			System.out.println("Enter Side:");
			int side = sc.nextInt();
			Square s = new Square(side, "Square");
			System.out.printf("Area of Square is:%.2f", s.calculateArea());
			break;
		case 3:
			System.out.println("Enter radius:");
			int radius = sc.nextInt();
			Circle c = new Circle(radius, "Circle");
			System.out.printf("Area of Circle is:%.2f", c.calculateArea());
			break;
		default:
			System.out.println("Choose an appropriate number");
		}
		sc.close();
	}
}
