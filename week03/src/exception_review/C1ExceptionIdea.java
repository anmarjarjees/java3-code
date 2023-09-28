package exception_review;

import java.util.Scanner;
/*
 * For full comments and details:
 * link: https://github.com/anmarjarjees/java-extra/blob/main/src/p01_exceptions/C1ExceptionIdea.java
 */
public class C1ExceptionIdea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * System.out.print("Enter your any number to divide (the numerator): ");
         * double num1 = input.nextDouble();
         * System.out.print("Enter your any number to divide by (the denominator): ");
         * double num2 = input.nextDouble();
         * 
         * double result = num1 / num2;
         * System.out.println("The result of dividing " + num1 + " by " + num2 + " is: "
         * + result);
         */

        /*
         * But with using integer input:
         */
        System.out.print("Enter your first whole (integer) number (the numerator): ");
        int n1 = input.nextInt();
        System.out.print("Enter your second whole (integer) number (the denominator): ");
        int n2 = input.nextInt();
        double div = n1 / n2;
        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);

        /*
         * Testing another common exception: going beyond the array length:
         */
        String[] names = { "Alex", "Sam", "Kate", "Martin", "Sarah" }; // index 4
        for (int i = 0; i < 6; i++) {
            System.out.println("First Name:" + names[i]);
        }
        /*
         * Exception:
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 5 out of bounds for length 5
         * 
         * The exception class is "ArrayIndexOutOfBoundsException"
         */

        input.close();

        /*
         * 3 Exception Classes were tested in this file:
         * - InputMismatchException => different data type
         * - ArithmeticException => division by 0
         * - ArrayIndexOutOfBoundsException
         */
    } // main()
} // class file
