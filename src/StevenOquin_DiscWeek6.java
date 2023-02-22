/**
 *  Name: Steven Oquin
 *  Date: 02/21/2023
 *  Class: CMIS 141/6380
 *  This program prompts the user for two different values then calculates the sum and returns it.
 */

import java.util.*;
public class StevenOquin_DiscWeek6 {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        // Prompt the user for input values
        System.out.print("Enter the first input value: ");
        int firstValue = stdin.nextInt();

        System.out.print("Enter the second input value: ");
        int secondValue = stdin.nextInt();

        // At least two different input values
        while (firstValue == secondValue) {
            System.out.println("Error: You must enter two different input values");
            System.out.println("Enter the first input value: ");
            firstValue = stdin.nextInt();

            System.out.print("Enter the second input value: ");
            secondValue = stdin.nextInt();
        }

        // Calculate the sum of the input values using the calculateSum method
        int sum = calculateSum(firstValue, secondValue);

        // Print the input values of their sum
        System.out.println("The first input value is " + firstValue);
        System.out.println("The second input value is " + secondValue);
        System.out.println("The sum of the input values is " + sum);
        System.out.println("I hope you enjoyed this program!");

        stdin.close();
    }

    //calculates the sum of the two input values then returns the result.
    public static int calculateSum(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        return sum;
    }
}