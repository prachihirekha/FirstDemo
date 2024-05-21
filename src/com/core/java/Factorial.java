package com.core.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long factorial = 1;
            int i = number;
            
            while (i > 0) {
                factorial *= i;
                i--;
            }
            
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        
        scanner.close();
    }
}


