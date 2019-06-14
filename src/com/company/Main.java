// Random generated number to check for prime
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int temp;
        int num;
        String prompt;
        Scanner scan = new Scanner(System.in);
        do {
            boolean isPrime = true;
            num = (int) (Math.random() * 250) + 1;
            System.out.println("The randomly generated num is: " + num);


            if (num == 1) {
                System.out.println(num + " is not a Prime Number");
                System.exit(1);
            }

            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            //If isPrime is true then the number is prime else not
            if (isPrime)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");

            System.out.println(" Continue ? yes or no");
            prompt = scan.next();
        }
        while(prompt.equalsIgnoreCase("yes"));

    }
}

