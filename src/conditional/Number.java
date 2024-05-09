package conditional;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
//Write a Java program that takes three numbers from the user and prints the greatest number.
public class Number {

	public static void main(String[] args) {
		 int x; 
		 System.out.println("Enter the number");
		 Scanner sc = new Scanner(System.in);
		 x=sc.nextInt();
		 if(x>=0) {
			 System.out.println("it is positive");
		// TODO Auto-generated method stub

	}else {
		System.out.println("it is negative");
	}

}
	}
