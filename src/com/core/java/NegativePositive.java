package com.core.java;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the number");
		i=sc.nextInt();
		if(i>0) {
			System.out.println("it is positive number");
		}
		else {
			System.out.println("it is negative number");
		}

	}

}
