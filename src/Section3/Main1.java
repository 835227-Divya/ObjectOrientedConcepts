package Section3;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product ID");
		Long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Product name");
		String productName = sc.nextLine();
		System.out.println("Enter the Suppliers name");
		String supplierName = sc.nextLine();
		Product p = new Product(id, productName, supplierName);
		System.out.println(p.toString());
		System.out.printf("Invoking getClass() method:class " + p.getClass().getSimpleName());
		sc.close();
	}
}
