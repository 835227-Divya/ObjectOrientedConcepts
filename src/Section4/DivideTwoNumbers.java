package Section4;


import java.util.Scanner;

public class DivideTwoNumbers {
	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 numbers");
			x=sc.nextInt();
			y=sc.nextInt();
		    System.out.println("The quotient is "+x+ "/" +y+"="+(x/y));
	
		}catch(ArithmeticException e) {
			System.out.println("DivideByZeroExceptionCaught");
		}finally {
			System.out.println("Invalid Exception");
			sc.close();
		}
	}
}
