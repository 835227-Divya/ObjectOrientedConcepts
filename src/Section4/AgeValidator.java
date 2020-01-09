package Section4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        System.out.print(str);
    }
}

public class AgeValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        try {
            if (age < 19) {
                
                throw new InvalidAgeException("Exception occured: ");

            } else {
                System.out.println("Welcome to vote");
            }
        } catch (InvalidAgeException a) {
            System.out.println(a.getClass().getSimpleName() + ":not valid");

        } finally {
            sc.close();
        }

    }
}