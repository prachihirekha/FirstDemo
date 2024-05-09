package com.core.java;
// paramitrized operators

public class Operators {
	void add(int a,int b) {
		System.out.println("addition = "+a+b);
	}
	void sub(int a, int b) {
		System.out.println("substration = "+(a-b));
	}
	void mul(int a,int b) {
		System.out.println("multiplication = "+a*b);
	}
	void div(int a, int b) {
		System.out.println("division = "+a/b);
	}
	void mod(int a,int b) {
		System.out.println("modules = "+a%b);
	}
	public static void main(String[] args) {
		// oprands a  operators + oprands a
		Operators od = new Operators();
		od.add(10,20);
		od.div(20,3);
		od.mul(10,10);
		od.sub(100,90);
		od.mod(70,100);
		
			}

}

	