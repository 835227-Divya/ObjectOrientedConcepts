package Section3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long id=0;
		String productName=null;
		String supplierName=null;
		
		System.out.println("Enter the product ID");
		id=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Product name");
		productName=sc.nextLine();
		System.out.println("Enter the Supplier name");
		supplierName=sc.nextLine();
		Product2 p=new Product2(id,productName,supplierName);
		p.display();
		System.out.println("Enter the product id");
		id=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the product name ");
		productName=sc.nextLine();
		System.out.println("Enter the supplierName ");
		supplierName=sc.nextLine();
		Product2 p2=new Product2(id,productName,supplierName);
		p2.display();
		if(p.equals(p2)) {
			System.out.println("The two products are the same");
		}else {
			System.out.println("The two products are different");
		}
		sc.close();
	}
			
		}
	