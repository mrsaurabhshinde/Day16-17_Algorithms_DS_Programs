package Algorithms;

import java.util.Scanner;

public class FindPrimeNumber
{
    private static Scanner scanner = new Scanner( System.in );

    /**
     * create a main method.the all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {

        /**
         * 1st enter the max no
         * here we set the 1000
         */
        System.out.println("Enter max number: ");

        /**
         *String i/p
         * Parses the string argument as a signed decimal integer.
         */
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );

        System.out.println("List of the prime number between 0 - " + maxNumber);

        /**
         *  for loop is used int num start with 0 is initializing here then check boolean condition,then update is
         *  increment +1
         *  suppose boolean isPrime then this condition is true
         */
        for (int num = 0; num <= maxNumber; num++) {

            boolean isPrime = true;
            /**
             * here again for loop is used
             * initialize i=2
             * this for loop is checking if the number is divisible by any number starting from 2.
             */
            for (int i=2; i <= num/2; i++)
            {
                /**
                 *num is divided by 2
                 * if condition is true then no is false
                 */
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            /**
             * condition check if its true then print num
             */
            if ( isPrime == true )
                System.out.println(num);
        }
    }
}
