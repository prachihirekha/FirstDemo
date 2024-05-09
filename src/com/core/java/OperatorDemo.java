package com.core.java;
/* java divides the operators into the following groups:
 * Arithmetic operators
 * +,-*,/.++,--,%
 * incarement operators or decrement operators
 * Assignment operators
 * comparison operators
 * logical operators
 * bitwise operators
 * */

public class OperatorDemo {
	int a =30;
	int b =46;
	void add() {
		System.out.println("addition = "+a+b);
	}
	void sub() {
		System.out.println("substration = "+(a-b));
	}
	void mul() {
		System.out.println("multiplication = "+a*b);
	}
	void div() {
		System.out.println("division = "+a/b);
	}
	void mod() {
		System.out.println("modules = "+a%b);
	}
	public static void main(String[] args) {
		// oprands a  operators + oprands a
		OperatorDemo od = new OperatorDemo();
		od.add();
		od.div();
		od.mul();
		od.sub();
		od.mod();
		
			}

}
