package exception_review;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * For full comments and details:
 * link: https://github.com/anmarjarjees/java-extra/blob/main/src/p01_exceptions/C2ExceptionDemo.java 
 */
public class C2ExceptionDemo {
    public static void main(String[] args) {
        /*
         * If the user inputs decimal => Exception
         * if the input is string => Exception
         * 
         * - InputMismatchException => different data type
         * - ArithmeticException => division by 0
         */
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter your first whole (integer) number (the numerator): ");
            int n1 = input.nextInt();
            System.out.print("Enter your second whole (integer) number (the denominator): ");
            int n2 = input.nextInt();
            double div = n1 / n2;
            System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        } catch (Exception e) {
            System.out.println(e.getClass());
            // class java.util.InputMismatchException
            // class java.lang.ArithmeticException
            System.out.println(e.getMessage());
            // null
            // / by zero
        } finally {
            input.close();
        }
    } // main()
} // class file
